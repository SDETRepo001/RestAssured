package Rest_Assured_project.Omid.Fake;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthorsGet {
    @Test
    void getAllAuthors() {

        given().
                when().get("https://fakerestapi.azurewebsites.net/api/v1/Authors")
                .then().statusCode(200).log().all();

    }
}


