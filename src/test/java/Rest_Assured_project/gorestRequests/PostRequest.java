package Rest_Assured_project.gorestRequests;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostRequest {

    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";
    @Test
    void createANewUser(){
        JSONObject jsonOj = new JSONObject();
        jsonOj.put("name", "Hamid hamiid");
        jsonOj.put("gender", "male");
        jsonOj.put("email", "hamid0asdf06sdf6@15ce.com");
        jsonOj.put("status", "active");

        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(jsonOj.toString())

                .when().post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201)
                .body("email", equalTo("hamid0asdf06sdf6@15ce.com")).log().body();
    }
}
