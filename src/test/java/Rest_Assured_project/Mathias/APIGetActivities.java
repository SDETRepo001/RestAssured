package Rest_Assured_project.Mathias;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class APIGetActivities {
    @Test
    public static void apiGetRequests() {
        Response response= given()
                .when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
        List<String> titles = response.jsonPath().getList("title");
        for(int i =0;i<titles.size();i++) {
            assert titles.get(i).equals("Activity " + (i + 1));
        }
        //response.then().log().all();
    }
}
