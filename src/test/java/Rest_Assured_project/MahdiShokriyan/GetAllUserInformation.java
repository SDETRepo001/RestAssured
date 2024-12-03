package Rest_Assured_project.MahdiShokriyan;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllUserInformation {

    @Test
    public static void getAllUserInfo() {

        given().header("Authorization", "Bearer " + CreateNewUser.token)
                .header("Content-Type", "application/json")
                .when().get("https://gorest.co.in/public/v2/posts")
                .then().statusCode(200).log().body();

    }


}
