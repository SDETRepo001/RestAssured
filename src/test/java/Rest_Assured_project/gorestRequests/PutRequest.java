package Rest_Assured_project.gorestRequests;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PutRequest {
    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    void updateAUser(){
        JSONObject jsonOj = new JSONObject();
        jsonOj.put("name", "Rafi BE");
        jsonOj.put("email", "rafiasdsdf06sdf6@15ce.com");
        jsonOj.put("status", "active");

        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(jsonOj.toString())

                .when().put("https://gorest.co.in/public/v2/users/7563489")
                .then().statusCode(200)
                .body("email", equalTo("rafiasdsdf06sdf6@15ce.com")).log().all();
    }
}
