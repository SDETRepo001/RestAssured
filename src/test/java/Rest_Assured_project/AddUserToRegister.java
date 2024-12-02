package Rest_Assured_project;
import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.*;

public class AddUserToRegister {

    @Test
    public void sendPostRequest() {
        // Create JSONObject
        JSONObject jsonData = new JSONObject();
        jsonData.put("email", "eve.holt@aasdfasdf.in");
        jsonData.put("password", "safdas");

        // Send the POST request
                 given()
                .contentType(ContentType.JSON)  // Specify content type as JSON
                .body(jsonData.toString())      // Pass the JSON data as the request body
                .when()
                .post("https://reqres.in/api/register") // Replace with your actual endpoint
                .then()
                .statusCode(200); // Assert that the response status is 200 (OK)
    }



}
