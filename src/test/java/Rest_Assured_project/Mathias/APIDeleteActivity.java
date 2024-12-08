package Rest_Assured_project.Mathias;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIDeleteActivity {
    @Test
    public static void apiDeleteRequest() {
        given()
                .when().delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/30")
                .then()
                .statusCode(200);
}
}
