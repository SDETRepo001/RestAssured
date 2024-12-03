package Rest_Assured_project.ghezal;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class ghezalDelayedResponse {

    @Test
    void DelayedRes() {
        // Send GET request with delay to the API
        Response res = given()
                .param("delay", 3)  // Adding delay query parameter to the request
                .when()
                .get("https://reqres.in/api/users");  // Your API endpoint

        // Extract the data array from the JSON response
        List<Object> users = res.jsonPath().getList("data");

        // Loop through the users and validate the first_name for each id
        for (int i = 0; i < users.size(); i++) {
            // Extract first_name for each user
            String firstName = res.jsonPath().getString("data[" + i + "].first_name");

            // Validate the first name (change the expected value as needed)
            // For example, you can add custom logic here or assert certain values
            System.out.println("User at index " + i + " has first name: " + firstName);

            // You can validate the first_name here based on your logic
            if (i == 0) {
                assert firstName.equals("George"); // Check for index 0
            } else if (i == 1) {
                assert firstName.equals("Janet"); // Check for index 1
            } else if (i == 2) {
                assert firstName.equals("Emma"); // Check for index 2
            }
            // Add additional checks for other indices as needed
        }
        // Alternatively, if you want to validate the response status and specific values using RestAssured's .then() assertions
        res.then()
                .statusCode(200) // Check if the response code is 200
                .body("data[0].first_name", equalTo("George"))  // Validate first_name for index 0
                .body("data[1].first_name", equalTo("Janet"))  // Validate first_name for index 1
                .body("data[2].first_name", equalTo("Emma")); // Validate first_name for index 2
    }
}
