
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class SingleNotFound {

    @Test
    void singleNotFound() {
        given()
                .when().get("https://reqres.in/api/users/23")
                .then().statusCode(404).log().all();
    }
}