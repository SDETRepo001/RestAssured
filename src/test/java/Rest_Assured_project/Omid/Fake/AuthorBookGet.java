package Rest_Assured_project.Omid.Fake;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import javax.swing.*;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthorBookGet {


    @Test
    void authorBookGet(){

//        given()
//                .pathParam("bookPath","v1/Authors/authors/books/")
//                .pathParam("idBook",25)
//                .when().get("https://fakerestapi.azurewebsites.net/api/{bookPath}/{idBook}")
//                .then().statusCode(200).log().all();

        Response res = given()
                .pathParam("bookPath", "v1/Authors/authors/books/")
                .pathParam("idBook", 25)
                .when().get("https://fakerestapi.azurewebsites.net/api/{bookPath}/{idBook}");

        String responseString = res.getBody().asString();

        // Log the response to verify
        System.out.println("Response: " + responseString);

        JSONArray jsonArray = new JSONArray(responseString);
        //JSONObject jo = new JSONObject(responseString);

// Parse the response as JSON
        JsonPath jsonPath = res.jsonPath();

        // Extract the list of all records
        List<Object> allData = jsonPath.getList("$");

        // Iterate through the response to find the desired id
        for (Object data : allData) {
            // Cast data to a Map (to access key-value pairs)
            Integer id = (Integer) ((Map<String, Object>) data).get("id");
            if (id == 69) {
                String firstName = (String) ((Map<String, Object>) data).get("firstName");
                System.out.println("First Name for id 69: " + firstName);
                break;
            }
        }







    }
}



