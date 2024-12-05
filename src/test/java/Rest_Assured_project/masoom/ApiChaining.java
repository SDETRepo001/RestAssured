package Rest_Assured_project.masoom;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiChaining {
    String id;
    String token = "4c8574c526c0453b1b39ee8e849e28de84070a90e3ab3509b5f14010e7857478";

    @Test(priority = 1)
    void createANewUser(){
        Faker faker = new Faker();
        String email =faker.internet().emailAddress();
        String name = faker.name().fullName();
        HashMap data = new HashMap();
        data.put("name",name);
        data.put("gender","male");
        data.put("email",email);
        data.put("status","active");


       Response result = given()
                .header("Authorization","Bearer "+ token)
                .contentType(ContentType.JSON)
                .body(data)
                .when().post("https://gorest.co.in/public/v2/users");
    id = result.jsonPath().getString("id");
    result.then().log().body();
    }


    @Test(priority = 2, dependsOnMethods = "createANewUser")
    void retrieveAllUser(){
        Response result = given()
                .header("Authorization","Bearer "+ token)
                .contentType(ContentType.JSON)
                .when().post("https://gorest.co.in/public/v2/users"+ id);
        id = result.jsonPath().getString("id");
        result.then().log().all();
    }
}
