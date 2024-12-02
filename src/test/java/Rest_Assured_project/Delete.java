package Rest_Assured_project;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class Delete{

    @Test

    void delete(){

        given().
                when().delete("https://reqres.in/api/users/2")
                .then().statusCode(204).log().all();


    }






}
