package in.reqres;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;

public class MassaDadosTeste {

    @BeforeClass
    public static void urlbase() {
        RestAssured.baseURI = "https://reqres.in/";

        RestAssured.requestSpecification = new RequestSpecBuilder().setContentType(ContentType.JSON).build();
    }
    String urlCadastrar = "api/users";
    String corpoCadastro = "{\"name\": \"Pedro\", \"job\": \"Analista\"}";
    String resposive = "application/json";

    String consultar = "api/users/2";
    String listar = "api/users?page=2";

}
