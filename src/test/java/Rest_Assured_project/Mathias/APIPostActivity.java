package Rest_Assured_project.Mathias;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class APIPostActivity {
    @Test
    public static void apiPostRequest() {
        given().body(new HashMap<>() {{
                    put("id", 31);
                    put("title", "Automation Engineer");
                    put("dueDate", "2024-12-08T19:02:36.286Z");
                    put("completed", true);
                }})
                .contentType(ContentType.JSON)
                .when().post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
                .then().statusCode(200)
                .log().body();
    }


}
