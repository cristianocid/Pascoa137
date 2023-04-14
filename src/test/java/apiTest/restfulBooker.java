package apiTest;

import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class restfulBooker {
    // Atributos
    static String ct = "application/json"; // content type
    static String uriUser = "https://restful-booker.herokuapp.com/auth"; // url do usuario
    static String uriCreateBooking = "https://restful-booker.herokuapp.com/booking"; // url criar Book
    static String uriConsultarBooking = "https://restful-booker.herokuapp.com/booking/";
    private static String token;        // id do Cookie para autenticação
    private static int idBooking;           // codigo id do Booking

    // Funções e Metodos
    // Funções de Apoio
    public static String lerArquivoJson(String arquivoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(arquivoJson)));
    }

    @BeforeAll
    public static void setup() throws IOException {
        String body = lerArquivoJson("src/test/resources/json/restfulBooker.json");

        Response resp = (Response) given()
                .contentType(ct)
                .log().all()
                .body(body)
                .when()
                .post(uriUser)
                .then()
                .log().all()
                .statusCode(200)
                .extract();

        token = resp.jsonPath().getString("token");
        System.out.println("Token: " + token);
    }

    // Funções de Testes
    @Test
    @Order(2)
    public void testarConsultarBooking() {
        String firstname = "Cristiano";

        // realizar o teste
        given()                                       // Dado que
                .contentType(ct)                      // o tipo de conteudo
                .log().all()                          // mostre tudo
                .when()                                       // Quando
                .get(uriConsultarBooking + idBooking)                        // Endpoint / Onde
                .then()                                       // Então
                .log().all()                          // mostre tudo na volta
                .statusCode(200)                    // comunicação ida e volta ok
                .body("firstname", is(firstname));        // tag code é 200
      }

    @Test
    @Order(1)
    public void testarCriarBooking() throws IOException {
        // carregar os dados do nosso json
        String jsonBody = lerArquivoJson("src/test/resources/json/createBooking.json");

        // realizar o teste
        Response resp = (Response) given()                                       // Dado que
                .contentType(ct)                      // o tipo de conteudo
                .log().all()                          // mostre tudo
                .body(jsonBody)                       // corpo da requisiçãp
                .when()                                       // Quando
                .post(uriCreateBooking)                        // Endpoint / Onde
                .then()                                       // Então
                .log().all()                          // mostre tudo na volta
                .statusCode(200)                    // comunicação ida e volta ok
                .extract();


        idBooking = resp.jsonPath().getInt("bookingid");
        System.out.println("ID do booking criado: " + idBooking);
    }

    @Test
    @Order(3)
    public void alterarBooking() throws IOException {
        String jsonBody = lerArquivoJson("src/test/resources/json/alterarBooking.json");

        given()
                .contentType(ct)
                .header("Cookie","token=" + token ) // Adiciona o cabeçalho de cookie
                .log().all()
                .body(jsonBody)
                .when()
                .put(uriConsultarBooking + idBooking)
                .then()
                .log().all()
                .statusCode(200)
                .body("firstname", is("Cristiano"))
                .body("lastname", is("cid"))
                .body("totalprice", is(777));
    }

    @Test
    @Order(4)
    public void testarExcluirBoking() throws IOException{
        given()
                .contentType(ct)
                .header("Cookie","token=" + token ) // Adiciona o cabeçalho de cookie
                .log().all()
                .when()
                .delete(uriConsultarBooking + idBooking)
                .then()
                .statusCode(201);
    }

}
