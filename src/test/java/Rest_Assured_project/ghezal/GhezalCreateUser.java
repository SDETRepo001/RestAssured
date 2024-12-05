package Rest_Assured_project.ghezal;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class GhezalCreateUser {
    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    void createUser() {

        JSONObject obj = new JSONObject();
        obj.put("name", "Ghazal safa");
        obj.put("gender", "Female");
        obj.put("email", "Zhazal@15csdfe.com");
        obj.put("status", "active");

        given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(obj.toString())
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then()
                .statusCode(201)
                .log().all();
    }
}

