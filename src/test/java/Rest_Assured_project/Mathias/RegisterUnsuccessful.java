package Rest_Assured_project.Mathias;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RegisterUnsuccessful {
    @Test
    public void registerUnsuccessful(){
        given()
                .body(new HashMap<>(){{
                    put("email", "peter@klaven");
                }})
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(400)
                .log().all();
    }
}
