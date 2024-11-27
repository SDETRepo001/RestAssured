
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RahimullahAssignmentCode {

    @Test
    void singleNotFound() {
        given()
                .when().get("https://reqres.in/api/users/23")
                .then().statusCode(404).log().all();
    }
}