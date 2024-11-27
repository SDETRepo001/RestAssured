package Rest_Assured_project;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class singleResource {
    @Test
       void singleUser() {

        given().
                when(). get("https://reqres.in/" +
                        "/api/unknown/2")
                .then().statusCode(200)

        .body("data.name", equalTo( "fuchsia rose" ))
                .body( "data.id",equalTo(2))
                                .body("data.year", equalTo(2001))
                                .body("data.color",  equalTo("#C74375"))
                .body("data.pantone_value", equalTo("17-2031")).
                log().all();



      //{
        //    "data": {
        //        "id": 2,
        //        "name": "fuchsia rose",
        //        "year": 2001,
        //        "color": "#C74375",
        //        "pantone_value": "17-2031"
        //    },
        //    "support": {
        //        "url": "https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral",
        //        "text": "Tired of writing endless social media content? Let Content Caddy generate it for you."
        //    }
        //}
      ///
      //
      ///
        //


    }
}