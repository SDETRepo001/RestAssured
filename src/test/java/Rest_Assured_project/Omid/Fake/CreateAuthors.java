package Rest_Assured_project.Omid.Fake;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateAuthors {


    @Test
    void createAuthors() {


         JSONObject data =new JSONObject();
     //   Map data = new HashMap<>();
        data.put("id", 586);
        data.put("idBook", 586);
        data.put("firstName", "First Name 586");
        data.put("lastName", "Last Name 586");

        given()
                .contentType(ContentType.JSON)
                .body(data.toString())
//                .body(data)
                .when().post("https://fakerestapi.azurewebsites.net/api/v1/Authors")
                .then().statusCode(200).log().all();


    }
}
