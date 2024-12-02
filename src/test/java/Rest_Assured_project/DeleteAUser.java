package Rest_Assured_project;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
public class DeleteAUser {

    @Test
    void updateUserInfo(){


        given()
                .when().delete("https://reqres.in/api/users/2")
                .then().statusCode(204).log().all();
    }



}
