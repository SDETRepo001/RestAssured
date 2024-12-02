package Rest_Assured_project;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UpdateSingleField {

     @Test
    void postAnewUser()

    {
        Map<String, String> data = new HashMap<>();
        data.put("name", "morpheus");
        data.put("job", "leader" );

        JSONObject obData = new JSONObject();

        obData.put("name", "morpheus");
        obData.put("job", "Soccer Player" );
        given().body(obData)
                .when().patch("https://reqres.in/api/users/2")
                .then().statusCode(200).log().body();
    }

}
