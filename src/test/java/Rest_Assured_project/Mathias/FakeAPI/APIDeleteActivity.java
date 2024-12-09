package Rest_Assured_project.Mathias.FakeAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIDeleteActivity {
    @Test
    public static void apiDelete() {
         given()
                .when().delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/2")
                .then().log().all();
    }
}
