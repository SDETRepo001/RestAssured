package Rest_Assured_project.ghezal;

import org.json.JSONObject;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;


import static io.restassured.RestAssured.given;

public class ghezalRegisterUnsuccessful {
    @Test
    void unsuccessfulRegistartion(){
        JSONObject obj = new JSONObject();
        obj.put(  "email", "sydney@fife" );



        given().body(obj);
        when().post("https://reqres.in/api/register")
                .then().statusCode(400)


                .body("data.error",equalTo( "Missing password" )).log().all();




    }
}
