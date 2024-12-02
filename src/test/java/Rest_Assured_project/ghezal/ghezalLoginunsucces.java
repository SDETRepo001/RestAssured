package Rest_Assured_project.ghezal;

import org.testng.annotations.Test;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class ghezalLoginunsucces {

    @Test
    void Unsuccess() {
        JSONObject object = new JSONObject();
        object.put("email", "peter@klaven"  );

        given().body( object );
        when().post("https://reqres.in/api/login")
                .then().statusCode(400).log().all();
    }
}