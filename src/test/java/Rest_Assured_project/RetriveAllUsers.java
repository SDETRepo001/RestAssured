package Rest_Assured_project;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;


public class RetriveAllUsers {


//@Test
public void RetriveallData() {

    given().
            when().get("https://reqres.in/api/users?page=2")
            .then().statusCode(200).log().all();
}
   // @Test
    public void retriveSpeficUserInfo() {
        given().
                when().get("https://reqres.in/api/users/8")
                .then().statusCode(200)
                .log().all();
//                .body("data.first_name", equalTo("Janet"))
//                .body("data.id", equalTo(2))
//                .body("data.last_name", equalTo("Weaver"))
    }

    @Test
    public void createAnewUser() {

    HashMap data = new HashMap();
    data.put("name", "Rahim");
    data.put("job", "Automation Engineer");



        given().body(data).
                when().post("https://reqres.in/api/users")
                .then().statusCode(201)
                .log().all();


//                .body("data.first_name", equalTo("Rahim"))
//                .body("data.job", equalTo("Automation Engineer")).
    }

}
