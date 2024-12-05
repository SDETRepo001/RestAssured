package Rest_Assured_project.masoom;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest1 {


    @Test
    void testPost() {
        HashMap<String, String> myData = new HashMap<>();
        myData.put("email", "eve.holt@reqres.in");
        myData.put("password", "pistol");

        // Send POST request
        given()
                .header("Content-Type", "application/json")
                .body(myData.toString())
                .when().post("https://reqres.in/api/register")
                .then().statusCode(400)
                .log().all();

    }
}