package Rest_Assured_project.MahdiShokriyan;
import static org.hamcrest.core.IsEqual.equalTo;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateNewUser {
    public static String randomEmail;
    public static String token =
            "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    void createANewUser() {
        randomEmail = randomEmailGenerator();
        JSONObject data = new JSONObject();
        data.put("name", "pattel khan");
        data.put("gender", "male");
        data.put("email", randomEmail);
        data.put("status", "active");

        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(data.toString())
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201)
                .body("gender", equalTo("male"))
                .log().all();

    }


    public static String randomEmailGenerator() {
        int randomNumber = (int) (Math.random() * 10000000);
        return "pattel." + randomNumber + "@moon.org";
    }

}
