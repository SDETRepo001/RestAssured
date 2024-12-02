package Rest_Assured_project;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateNewUsers {
    @Test
    public void createNewUser(){
        given()
                .body(new HashMap <> (){{
                    put("name","Mathias");
                    put("job","Tester");

                }})
                .when().post("https://reqres.in/api/users")
                .then()
                .statusCode(201).log().all();
    }

}
