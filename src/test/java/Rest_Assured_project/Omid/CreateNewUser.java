package Rest_Assured_project.Omid;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class CreateNewUser {


@Test
     void createOneUser() {


        Map data=new HashMap<String,String>();
        data.put("name", "Omid");
        data.put("email","OmidTest@link.test");
        data.put("gender", "male");
        data.put("status", "active");


        given().body(data).
                when().post("https://gorest.co.in/public/v2/users").
                then().statusCode(201)
                ;
    }
}
