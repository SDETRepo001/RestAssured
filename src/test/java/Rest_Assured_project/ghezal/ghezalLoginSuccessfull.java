package Rest_Assured_project.ghezal;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;
public class ghezalLoginSuccessfull {

    @Test
    void LoginSuccess(){
        JSONObject objs = new JSONObject();
        objs.put("email", "eve.holt@reqres.in");
         objs.put("password", "cityslicka");
given().body(objs).when().post("https://reqres.in/api/login").then().statusCode( 200 ).log().all();






    }

}
