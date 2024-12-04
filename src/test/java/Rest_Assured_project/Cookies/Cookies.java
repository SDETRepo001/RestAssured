package Rest_Assured_project.Cookies;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Cookies {


    @Test
    public void handleCookiesAndCaptcha() {
        // Set Base URI for Amazon


        // Send GET Request
        Response response = RestAssured
                .given()
                .when().get("https://google.com");

        // Print the response status and cookies
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Cookies: " + response.getCookie("NID"));



        Map <String, String> cookies = response.getCookies();
            for (Map.Entry<String, String> cookie : cookies.entrySet()) {
                System.out.println("Cookie Name: " + cookie.getKey() + ", Cookie Value: " + cookie.getValue());


            }


        }

}