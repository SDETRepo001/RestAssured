package Rest_Assured_project;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.*;

import static io.restassured.RestAssured.given;

public class APIChaining {

    String id;
    Faker faker = new Faker();


    @Test(priority = 1)
    void createANewUser()
    {

        String email = faker.internet().emailAddress();
        String name = faker.name().fullName();
        Map<String, String> data = new HashMap<>();
        data.put("name", name);
        data.put("gender", "male");
        data.put("email", email);
        data.put("status", "active");

       Response result = given().header("Authorization", "Bearer e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821").body(data)
                .contentType(ContentType.JSON)
                .when().post("https://gorest.co.in/public/v2/users");
       result.then().log().body();
       id = result.jsonPath().getString("id");
        System.out.print(id);


    }
    @Test(priority =2, dependsOnMethods = "createANewUser")
    void retriveAUser()
    {
        Response result = given().header("Authorization", "Bearer e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821")
                .when().get("https://gorest.co.in/public/v2/users/"+id);
        id = result.jsonPath().getString("id");
        System.out.print(id);
        result.then().log().all();
    }

    @Test(priority =3, dependsOnMethods = "createANewUser")
    void updateAUser()
    {
        String email = faker.internet().emailAddress();
        String name = faker.name().fullName();

        Map<String, String> data = new HashMap<>();
        data.put("name", name);
        data.put("gender", "male");
        data.put("email", email);

        Response result = given().header("Authorization", "Bearer e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821")
                .body(data).contentType(ContentType.JSON).when().put("https://gorest.co.in/public/v2/users/"+id);
        id = result.jsonPath().getString("id");
        System.out.print(id);
        result.then().log().all();
    }

    @Test(priority =4, dependsOnMethods = "createANewUser")
    void deleteAUser()
    {

        Response result = given().header("Authorization", "Bearer e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821")
                .when().delete("https://gorest.co.in/public/v2/users/"+id);
        result.then().log().all();
    }


}
