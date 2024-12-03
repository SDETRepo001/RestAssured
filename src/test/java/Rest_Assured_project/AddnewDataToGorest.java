package Rest_Assured_project;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.*;

public class AddnewDataToGorest {



//
//
//    {"name":"Tenali Ramakrsdfsishna", "gender":"male",
//            "email":"tenasdfsli.ramakrishna@15ce.com", "status":"active"}



    @Test
    void createAnewUser()
    {
         Map <String,String> data = new HashMap<>();
        JSONObject jsonData = new JSONObject();

        jsonData.put("name", "Ahmad");
        jsonData.put("gender", "male");
        jsonData.put("email", "ahmad@15ce.com");
        jsonData.put("status", "active");



        given().contentType(ContentType.JSON)
                .body(jsonData)
                .when().post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201).log().body();
    }
}
