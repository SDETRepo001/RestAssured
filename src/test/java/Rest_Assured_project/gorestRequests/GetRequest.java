package Rest_Assured_project.gorestRequests;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetRequest {
    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";


    @Test
    void RetriveUser(){


        given()
                .header("Authorization", "Bearer " + token)

                .when().get("https://gorest.co.in/public/v2/users/7563489")
                .then().statusCode(200)
                .body("name", equalTo("tekSchool22959 Mathias")).log().body();
    }
}
