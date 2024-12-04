package Rest_Assured_project.MahdiShokriyan;
import static org.hamcrest.core.IsEqual.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityGet {
    @Test
    void getAllActivities() {

        RestAssured.given()
                .when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
                .then().statusCode(200)
                .and().body("title[1]", equalTo("Activity 2")).log().body();
    }

    @Test
    void getSpecificActivity() {

        Response res = RestAssured.given()
                .when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities/24")
                .then().statusCode(200).extract().response();
        res.getBody().prettyPrint();
       String title =  res.jsonPath().getString("title");
        Assert.assertEquals(title , "Activity 24");

    }


}
