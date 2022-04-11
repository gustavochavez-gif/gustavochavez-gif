package in.reqres;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class ConsultaCadastro extends MassaDadosTeste {
    @Test
    public void consultaCadastroUser() {
        given().
        when().get(consultar).
        then().statusCode(HttpStatus.SC_OK);
    }
}
