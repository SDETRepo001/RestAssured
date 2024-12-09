package Rest_Assured_project.Omid.Fake;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AuthorUpdate {

    @Test
    void authorUpdate(){

//{
//  "id": 0,
//  "idBook": 0,
//  "firstName": "string",
//  "lastName": "string"
//}

       JSONObject data=new JSONObject() ;

       data.put("id", 25);
       data.put("idBook", 100);
       data.put("firstName","jhon");
       data.put("lastName","Nobody");


       given().contentType(ContentType.JSON).body(data.toString())
               .pathParam("pathParam","v1/Authors")
               .pathParam("id",25)
               .when().put("https://fakerestapi.azurewebsites.net/api/{pathParam}/{id}")
               .then().statusCode(200)
               .body("firstName",equalTo("jhon"))
               .body("lastName",equalTo("Nobody"))
               .log().all();


    }
}
