package Rest_Assured_project.Mathias.FakeAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIPostUser {
    @Test
    public void apiPostUsers() {
        given().body("""
                        {
                          "id": 1,
                          "userName": "Mathias",
                          "password": "akomas300"
                        }
                        """)
                .contentType(ContentType.JSON)
                .baseUri("https://fakerestapi.azurewebsites.net")
                .pathParam("url","/api/v1/Users")
                .when().post("/{url}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
