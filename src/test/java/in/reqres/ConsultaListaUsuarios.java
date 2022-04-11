package in.reqres;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

public class ConsultaListaUsuarios extends MassaDadosTeste {
    @Test
    public void consultaListaUsuarios() {
                given().
                when().get(listar).
                then().statusCode(HttpStatus.SC_OK).body("page", is( 2)).body("data", is(notNullValue()));
    }
}
