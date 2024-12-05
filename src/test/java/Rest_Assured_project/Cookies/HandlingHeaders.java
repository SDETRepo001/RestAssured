package Rest_Assured_project.Cookies;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HandlingHeaders {

    @Test
    void headersvalidation()
    {

       Response res = given()
                .when().get("https://www.google.com/");
//                .then().header("Content-Type","text/html; charset=ISO-8859-1").
//
//                log().headers();

        String myContentType = res.getHeader("Content-Type");
        Assert.assertEquals(myContentType, "text/html; charset=ISO-8859-1");
        res.then().log().headers();
        res.then().statusCode(200);
    }
}

