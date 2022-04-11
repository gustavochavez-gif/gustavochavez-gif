package in.reqres;


import org.apache.http.HttpStatus;
import org.junit.Test;
//import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class RegistrarCadastro extends MassaDadosTeste {

    @Test
    public void cadastro () {
         given().body(corpoCadastro).
                when().post(urlCadastrar).
               then().statusCode(HttpStatus.SC_CREATED).body("name", is("Pedro"));
    }

}





