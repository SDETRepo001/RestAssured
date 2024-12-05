package Rest_Assured_project.MahdiShokriyan;

import io.restassured.http.ContentType;
import org.hamcrest.core.IsEqual;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class ActivityPost {

    @Test
    void postNewActivity() {
        JSONObject obj = new JSONObject();
        obj.put("id", 36);
        obj.put("title", "Activity 36");
        obj.put("dueDate", "2024-12-04T03:45:07.381Z");
        obj.put("completed", true);

        given().contentType(ContentType.JSON)
                .baseUri("https://fakerestapi.azurewebsites.net")
                .basePath("/api/v1/Activities")
                .body(obj.toString())
                .when().post()
                .then().statusCode(200).
                body("title", IsEqual.equalTo("Activity 36"))
                .log().all();
    }


}
