package Rest_Assured_project.Mathias;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RegisterSuccessful {
    @Test
    public static void registerSuccessful(){
       /* JSONObject obj = new JSONObject();
        obj.put("email","eve.holt@reqres.in");
        obj.put("password","pistol");*/

        given().contentType(ContentType.JSON).body(
                        """
                                {
                                    "email": "eve.holt@reqres.in",
                                    "password": "pistol"
                                }
                            """
                )
                .when().post("https://reqres.in/api/register")
                .then()
                .statusCode(200)
                .log().all();
        System.out.println("Mathias");
    }

}
