package Rest_Assured_project.masoom;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ListAllUsers {


    @Test
    void listUsers() {
        given().
                when().get("https://gorest.co.in/public/v2/users")
                .then().statusCode(200).log().body();
    }
}
