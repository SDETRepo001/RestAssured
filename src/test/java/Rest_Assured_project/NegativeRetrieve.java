package Rest_Assured_project;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class NegativeRetrieve {

    @Test
    void negativeRetrieve(){
        given().
                when().get("https://reqres.in/api/unknown")
                .then().statusCode(200).log().all();
    }
}
