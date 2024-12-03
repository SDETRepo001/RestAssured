package Rest_Assured_project;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.*;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;




import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class registerPost {

    @Test
    void SuccessfulRegistartion(){

        JSONObject ob = new JSONObject();
        ob.put( "email", "eve.holt@reqres.in");
        ob.put( "password", "pistol" );
        given().body(ob);
        when().post("https://reqres.in/api/register")
                .then().statusCode(200).log().all()
        .body("data.id", equalTo( 4 ))
                .body("data.token", equalTo( "QpwL5tke4Pnpja7X4" )).log().all();

    }
}
