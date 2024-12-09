package Rest_Assured_project.Mathias.FakeAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class APIDeleteUser {
    @Test
    public void apiDeleteUser(){
        given().baseUri("https://fakerestapi.azurewebsites.net")
                .pathParam("url","/api/v1/Users/2")
                .when().delete("/{url}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
