package Rest_Assured_project.Mathias;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.mozilla.javascript.Token;
import org.testng.annotations.Test;

import java.util.HashMap;

import static Rest_Assured_project.UtilityClass.randomEmail;
import static Rest_Assured_project.UtilityClass.randomUserName;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class NewUser {
    @Test
    public static void newUser() {
        String randomUserName=randomUserName()+" Mathias";
        String randomEmail = randomEmail();
        HashMap<String, String> map = new HashMap<>();
        map.put("name", randomUserName);
        map.put("gender", "male");
        map.put("email", randomEmail);
        map.put("status", "active");
        String token ="Bearer e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

                 given().header("Authorization", token)
                         .contentType(ContentType.JSON)
                         .body(map)
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201)
                .body("name",equalTo(randomUserName)).log().all();
    }
}
