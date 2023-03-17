// nome do pacote
package apiTest;

// Bibliotecas
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// Classe
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class testUser{
    // Atributos
    static String ct = "application/json"; // content type
    static String uriUser = "https://petstore.swagger.io/v2/user/"; // url do usuario

    // Funções e Metodos
    // Funções de Apoio
    public static String lerArquivoJson(String arquivoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(arquivoJson)));
    }

    // Funções de Testes
    @Test
    @Order(1)
    public void testarIncluirUser() throws IOException {
        // carregar os dados do nosso json
        String jsonBody = lerArquivoJson("src/test/resources/json/user1.json");

        String userId = "1371739181";                 // codigo id do usuario

        // realizar o teste
        given()                                       // Dado que
                .contentType(ct)                      // o tipo de conteudo
                .log().all()                          // mostre tudo
                .body(jsonBody)                       // corpo da requisiçãp
        .when()                                       // Quando
                .post(uriUser)                        // Endpoint / Onde
        .then()                                       // Então
                .log().all()                          // mostre tudo na volta
                .statusCode(200)                    // comunicação ida e volta ok
                .body("code", is(200))        // tag code é 200
                .body("type", is("unknown"))  // tag type é "unknown"
                .body("message", is(userId));       // message é o userId
    }

    @Test
    @Order(2)
    public void testarConsultarUser(){
        String username = "josue";

        given()
                .contentType(ct)
                .log().all()
        .when()
                .get(uriUser + username)
        .then()
                .log().all()
                .body("id", is(1371739181))
                .body("username", is(username))
                .body("firstName", is(username));
    }
    @Test
    @Order(3)
    public void alterarUser() throws IOException {
        String jsonBody = lerArquivoJson("src/test/resources/json/user2.json");

        String userId = "1371739181";
        String username = "josue";

        given()
                .contentType(ct)
                .log().all()
                .body(jsonBody)
        .when()
                .put(uriUser + username)
        .then()
                .log().all()
                .statusCode(200)
                .body("code", is(200))
                .body("type", is("unknown"))
                .body("message", is(userId));
    }
    @Test
    @Order(4)
    public void testarExcluirUser(){
        String username = "josue";

        given()
                .contentType(ct)
                .log().all()
        .when()
                .delete(uriUser + username)
        .then()
                .statusCode(200)
                .body("code", is(200))
                .body("type", is("unknown"))
                .body("message", is(username));
    }
}