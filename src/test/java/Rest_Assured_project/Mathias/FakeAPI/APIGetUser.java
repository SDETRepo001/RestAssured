package Rest_Assured_project.Mathias.FakeAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIGetUser {
    @Test
    public void apiGetUser() {
        given().baseUri("https://fakerestapi.azurewebsites.net")
                .pathParam("url","/api/v1/Users/2")
               // .queryParam("id",2)
                .when().get("/{url}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
