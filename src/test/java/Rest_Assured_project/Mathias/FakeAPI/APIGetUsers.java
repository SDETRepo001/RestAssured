package Rest_Assured_project.Mathias.FakeAPI;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class APIGetUsers {
    @Test
    public void apiGetUsers() {
        given().baseUri("https://fakerestapi.azurewebsites.net")
                .pathParam("url","/api/v1/Users")
                .when().get("/{url}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
