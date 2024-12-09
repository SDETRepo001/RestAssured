package Rest_Assured_project.Mathias.FakeAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class APIPutActivity {
    @Test
    public static void apiPutRequest() {
        given().body(new HashMap<>() {{
                    put("title", "Automation Engineer");
                    put("dueDate", "2024-12-08T19:02:36.286Z");
                    put("completed", true);
                }})
                .contentType(ContentType.JSON)
                .when().put("https://fakerestapi.azurewebsites.net/api/v1/Activities/1")
                .then().statusCode(200)
                .log().body();
    }
}
