package apiTest;

import io.restassured.response.Response;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;

public class restfulBooker {
    // Atributos
    static String ct = "application/json"; // content type
    static String uriUser = "https://restful-booker.herokuapp.com/auth"; // url do usuario
    static String uriCreateBooking = "https://restful-booker.herokuapp.com/booking"; // url criar Book
    static String uriConsultarBooking = "https://restful-booker.herokuapp.com/booking/";
    private String token;
    static String idBooking = "16";                 // codigo id do Booking

    // Funções e Metodos
    // Funções de Apoio
    public static String lerArquivoJson(String arquivoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(arquivoJson)));
    }

    // Funções de Testes
    @Test
    @Order(1)
    public void testarConsultarBooking() {
        // carregar os dados do nosso json
        //String jsonBody = lerArquivoJson("src/test/resources/json/createBooking.json");
        String firstname = "Cristiano";
        String lastname = "Bonfim";
        Integer totalprice = 666;

        // realizar o teste
        given()                                       // Dado que
                .contentType(ct)                      // o tipo de conteudo
                .log().all()                          // mostre tudo
                .when()                                       // Quando
                .get(uriConsultarBooking + idBooking)                        // Endpoint / Onde
                .then()                                       // Então
                .log().all()                          // mostre tudo na volta
                .statusCode(200)                    // comunicação ida e volta ok
                .body("firstname", is(firstname))        // tag code é 200
                .body("lastname", is(lastname)) // tag type é "unknown"
                .body("totalprice", is(totalprice));       // message é o userId
    }

    @Test
    @Order(2)
    public void testarCriarBooking() throws IOException {
        // carregar os dados do nosso json
        String jsonBody = lerArquivoJson("src/test/resources/json/createBooking.json");

        //String userToken = "123456";                 // codigo id do usuario

        // realizar o teste
        given()                                       // Dado que
                .contentType(ct)                      // o tipo de conteudo
                .log().all()                          // mostre tudo
                .body(jsonBody)                       // corpo da requisiçãp
                .when()                                       // Quando
                .post(uriCreateBooking)                        // Endpoint / Onde
                .then()                                       // Então
                .log().all()                          // mostre tudo na volta
                .statusCode(200)                    // comunicação ida e volta ok
                .body("booking.firstname", is("Cristiano"))        // tag code é 200
                .body("booking.lastname", is("Bonfim")) // tag type é "unknown"
                .body("booking.totalprice", is(666));       // message é o userId
    }


    @Test
    @Order(3)
    public String testarIncluirUser() throws IOException {
        // carregar os dados do nosso json
        String jsonBody = lerArquivoJson("src/test/resources/json/restfulBooker.json");

        //String userToken = "123456";                 // codigo id do usuario

        // realizar o teste
        Response resp = (Response) given()                                       // Dado que
                .contentType(ct)                      // o tipo de conteudo
                .log().all()                          // mostre tudo
                .body(jsonBody)                       // corpo da requisiçãp
                .when()                                       // Quando
                .post(uriUser)                        // Endpoint / Onde
                .then()                                       // Então
                .log().all()                          // mostre tudo na volta
                .statusCode(200)                   // comunicação ida e volta ok
                .body("token", notNullValue())
                .body("token", hasLength(15))
                .extract();


        // Extração do token da resposta
        String token = extrairToken(resp);
        System.out.println("token: " + token);

        // retornar o token
        return token;
    }
    private String extrairToken(Response resp) {
        return resp.jsonPath().getString("token").substring(0);
    }

    @Test
    @Order(4)
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
    @Order(5)
    public void testarExcluirBoking(){

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
