package Rest_Assured_project.MahdiShokriyan;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class MahdiShokriyanRegisterEmail {

    @Test
    void registerNewUser() {
      /*  HashMap<String, String> data = new HashMap<>();
        data.put("email", "eve.hsdfolt@reqres.in");
        data.put("password", "pisdfdsstol1!");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "dfddf.holt@reqres.in");
        jsonObject.put("password", "pidddstol1!");*/

        Response res = given().contentType(ContentType.JSON).body(
                        """
                                {
                                    "email": "eve.holt@reqres.in",
                                    "password": "pistol"
                                }
                                """
                )
                .when().post("https://reqres.in/api/register")
                .then().statusCode(200).extract().response();
        res.prettyPrint();


    }

    @Test
    void registerUnsuccessfull() {

        HashMap<String, String> data = new HashMap<>();
        data.put("email", "sydney@fife");

        given().body(data).
                when().post("https://reqres.in/api/register")
                .then().statusCode(400).log().body();
    }

    @Test
    void loginSuccessful() {
        HashMap<String, String> data = new HashMap<>();
        data.put("email", "eve.holt@reqres.in");
        data.put("password", "cityslicka");


        RestAssured.given().contentType(ContentType.JSON)
                .body(data)
                .when().post("https://reqres.in/api/login")
                .then().statusCode(200).log().body();
    }

    @Test
    void loginUnsuccessful() {

        Response res = RestAssured.given().contentType(ContentType.JSON)
                .body(
                        """
                                {
                                    "email": "peter@klaven"
                                }
                                """
                )
                .when().post("https://reqres.in/api/login")
                .then().statusCode(400).extract().response();
        res.equals("Missing password");
        res.prettyPrint();
    }

    @Test
    void delayedResponse(){

                given()
                .when().get("https://reqres.in/api/users?delay=3")
                        .then().statusCode(200).log().body();


    }


}
