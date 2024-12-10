package Rest_Assured_project.Mathias;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.slf4j.MDC.put;

public class CreateNewUsers {
    @Test
    public void createNewUser(){


        given().body(
                """
                {
                    "name": "morpheus",
                    "job": "Tester"
                }
                """)
                .when().post("https://reqres.in/api/users")
                .then()
                .statusCode(201).log().all();
    }
    @Test
    public void createNewUsers(){

         given()
        .body(new HashMap<> (){{
             put("name","Mathias");
            put("job","Tester");

         }})

                .when().post("https://reqres.in/api/users")
                .then()
                .statusCode(201).log().all();
    }

}
