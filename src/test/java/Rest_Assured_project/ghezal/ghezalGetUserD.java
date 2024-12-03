package Rest_Assured_project.ghezal;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
public class ghezalGetUserD {

    @Test
    void getUsersDetails(){


        given()
                .when().get("https://gorest.co.in/public/v2/users/7563378")
                .then().statusCode( 200 )
    .body("id", equalTo( 7563378 )).log().all();


    }


}
