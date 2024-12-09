package Rest_Assured_project.Mathias.FakeAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class APIPutUser {
    @Test
    public void apiPutUser(){
        given().baseUri("https://fakerestapi.azurewebsites.net")
                .pathParam("url","/api/v1/Users/2")
                .body(new HashMap<>(){{
                    put("userName", "Tekschool");
                    put("password", "teck");
                }})
                .contentType(ContentType.JSON)
                .when().put("/{url}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
