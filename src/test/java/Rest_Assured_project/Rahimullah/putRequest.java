package Rest_Assured_project.Rahimullah;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class putRequest {


    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    public void putRequest() {

        Map<String, String> body = new HashMap<>();
        body.put("name:", "Rahimullah Siddiqi");
        body.put("email", "tenali.ramakrishna@15ce.com");
        body.put("status", "active");

        given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when().put("https://gorest.co.in/public/v2/users/6942852")
                .then().statusCode(200).log().all();


    }
}






