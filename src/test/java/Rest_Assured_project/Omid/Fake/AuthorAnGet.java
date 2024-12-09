package Rest_Assured_project.Omid.Fake;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthorAnGet {

    @Test
    void authorsAnGet(){
        ///api/v1/Activities/{id}
        given()
                .pathParam("pathParam","/v1/Activities/")
                .pathParam("id",10)
                .when().get("https://fakerestapi.azurewebsites.net/api/{pathParam}/{id}")
                .then().statusCode(200).log().all();

    }
}
