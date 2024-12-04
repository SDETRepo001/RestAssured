package Rest_Assured_project.Cookies;

import org.testng.annotations.Test;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
public class CookiesHandling {

    @Test
    void cookiesHandling()
    {

        given()
                .when().put("https://www.google.com/")
                .then().log().cookies();
    }
}
