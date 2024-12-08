package Rest_Assured_project.Mathias;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class APIGetActivity {
    @Test
    public static void apiGetRequest() {
        given()
                .when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities/30")
                .then()
                .statusCode(200)
                .body("id", equalTo(30))
                .body("title", equalTo("Activity 30"))
                .log().all();
    }
}
