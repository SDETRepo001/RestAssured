package Rest_Assured_project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.hamcrest.core.IsEqual.equalTo;

import static io.restassured.RestAssured.given;

public class Authantications {

    @Test
    void handalingBasicAuth() {

        given().auth().basic("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().body("authenticated", equalTo(true));
    }

    @Test
    void handalingDigestAuth() {

        given().auth().digest("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().body("authenticated", equalTo(true));
    }

    @Test
    void handalingPreempiveAuth() {
        given().auth().preemptive().basic("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().body("authenticated", equalTo(true));
    }
    //@Test
//    void handalingbearerAuth()
//    {
//        String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";
//        given().auth().oauth2(token)
//                .when().get("https://postman-echo.com/basic-auth")
//                .then().body("authenticated", equalTo(true));
//    }


    //First way
    @Test
    public static void handalingbearerAuth() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Mathasdfasasdfiasd Akasfowanou");
        map.put("gender", "male");
        map.put("email", "akomasdfasaasds30sd0@gmail.com");
        map.put("status", "active");
        String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

        given().auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201)
                .log().all();
    }

    // second way
    @Test
    public static void handalingbearerAuth2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "M Akasasdfasdffowanou");
        map.put("gender", "male");
        map.put("email", "akoasasdfasdfdf@gmail.com");
        map.put("status", "active");
        String token = "Bearer e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";
        given().header("Authorization", token)
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201)
                .log().all();
    }
    @Test
    void oAuthOne() {
        given()
                .auth()
                .oauth("consumerKey", "consumerSecret", "accessToken", "secretToken")
                .when()
                .get("/endpoint")
                .then()
                .statusCode(200);
    }

    @Test
    void oAuthTwo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "asdsdddddddddddddasdfasdffowanou");
        map.put("gender", "male");
        map.put("email", "akoasdddddddddddf@gmail.com");
        map.put("status", "active");
        String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

        given().auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then().statusCode(201)
                .log().all();
    }



}