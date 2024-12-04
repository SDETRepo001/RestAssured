package Rest_Assured_project.Rahimullah;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;
import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class deleteRequest {


    String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    public void deleteRequest() {


        given()
                .header("Authorization", "Bearer " + token)

                .when().delete("https://gorest.co.in/public/v2/users/6942852")
                .then().statusCode(204);
    }


}




