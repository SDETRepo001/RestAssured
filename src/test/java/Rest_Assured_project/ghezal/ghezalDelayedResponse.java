package Rest_Assured_project.ghezal;

import org.json.JSONObject;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class ghezalDelayedResponse {

    @Test
    void DelayedRes(){
        JSONObject object = new JSONObject();
        object.put("id", 1  );
        object.put( "email", "george.bluth@reqres.in" );
        object.put(  "first_name", "George" );
        object.put("last_name", "Bluth" );
        object.put( "avatar", "https://reqres.in/img/faces/1-image.jpg" );

        given().body(object);
        when().get("https://reqres.in/api/users?delay=3")
                .then().statusCode(200).log().all();




    }
}
