package Rest_Assured_project;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.*;


import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
public class CreateUser {

     @Test
    void postAnewUser()

    {
        Map<String, String> data = new HashMap<>();
        data.put("name", "morpheus");
        data.put("job", "leader" );

        JSONObject obData = new JSONObject();

        obData.put("name", "morpheus");
        obData.put("job", "leader" );


        given().body(obData)
                .when().post("https://reqres.in/api/users")
                .then().statusCode(201).log().body();

    }

}
