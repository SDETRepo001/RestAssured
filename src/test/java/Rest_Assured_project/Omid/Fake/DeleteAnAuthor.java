package Rest_Assured_project.Omid.Fake;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteAnAuthor {


    @Test
    void deleteAnAuthor(){

        given()
                .pathParam("deletePath","v1/Authors/10")
                .when().delete("https://fakerestapi.azurewebsites.net/api/{deletePath}")
                .then().statusCode(200);

    }
}
