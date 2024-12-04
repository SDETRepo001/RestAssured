package Rest_Assured_project.Omid;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class CreateNewUser {
    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

@Test
     void createOneUser() {


        Map data=new HashMap<String,String>();
        data.put("name", "Omid1");
        data.put("email","OmidTest1@link.test");
        data.put("gender", "male");
        data.put("status", "active");


        given()  .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json").body(data).
                when().post("https://gorest.co.in/public/v2/users").
                then().statusCode(201);
    }
}
