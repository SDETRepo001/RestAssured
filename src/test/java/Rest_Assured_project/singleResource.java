package Rest_Assured_project;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class singleResource {
    @Test
       void singleUser() {

        given().
                when(). get("https://reqres.in/api/unknown/2")
                .then().statusCode(200)

        .body("data.name", equalTo( "fuchsia rose" ))
                .body( "data.id",equalTo(2))
                                .body("data.year", equalTo(2001))
                                .body("data.color",  equalTo("#C74375"))
                .body("data.pantone_value", equalTo("17-2031")).
                log().all();




    }
}