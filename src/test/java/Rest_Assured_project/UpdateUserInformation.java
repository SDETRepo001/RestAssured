package Rest_Assured_project;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
public class UpdateUserInformation {

    @Test
    void updateUserInfo(){
        JSONObject jo = new JSONObject();

        jo.put("email","janet.weaver@reqres.in" );
        jo.put("first_name","John" );
        jo.put("last_name","Sam" );
        jo.put("avatar","https://reqres.in/img/faces/2-image.jpg" );
        given().body(jo)
                .when().put("https://reqres.in/api/users/2")
                .then().statusCode(200).log().body();
    }

}
