package Rest_Assured_project.gorestRequests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class DeleteRequst {


    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    void deleteUser(){

        given()
                .header("Authorization", "Bearer " + token)

                .when().delete("https://gorest.co.in/public/v2/users/7563487")
                .then().statusCode(204).log().all();
    }
}
