package Rest_Assured_project.QueryParmAndPathParm;

import io.restassured.http.ContentType;
import org.hamcrest.core.IsEqual;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class QueryParmAndPathParm {


    //@Test
    void practiceQueryAndPathParmw() {
        given().pathParam("pathParm", "/api/v1/Authors/authors/books/234")
                .when().get("https://fakerestapi.azurewebsites.net{pathParm}")
                .then().statusCode(200).log().body();
    }

    @Test
    void practiceQueryAndPathParm() {
        given()
                .pathParam("pathParm", "users") // Set the path parameter
                .queryParam("page", 2)           // Add the 'page' query parameter
                .queryParam("id", 5)             // Add the 'id' query parameter
                .when()
                .get("https://reqres.in/api/{pathParm}") // Use the path parameter in the URL
                .then()
                .statusCode(200)                   // Validate the response status code
                .log().everything();                      // Log all details of the response
    }

}