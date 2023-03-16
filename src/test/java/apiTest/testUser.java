// nome do pacote
package apiTest;

// Bibliotecas
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// Classe
public class testUser{
    // Atributos
    String ct = "application/json"; // content type
    String uriUser = "https://petstore.swagger.io/v2/user/"; // url do usuario

    // Funções e Metodos
    // Funções de Apoio
    public static String lerArquivoJson(String arquivoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(arquivoJson)));
    }

    // Funções de Testes
    @Test
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
}