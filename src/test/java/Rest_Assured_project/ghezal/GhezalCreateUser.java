package Rest_Assured_project.ghezal;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class GhezalCreateUser {

    @Test
    void createUser(){



    JSONObject obj = new JSONObject();
    obj.put("name", "Tenali Ramakrishna");
    obj.put("gender", "male");
    obj.put("email", "tenali.ramakrishna@15ce.com");
    obj.put("status", "active");

     given().body(obj)
             .when().post("https://gorest.co.in/public/v2/users")
             .then().statusCode(201).log().all();





    }
}
