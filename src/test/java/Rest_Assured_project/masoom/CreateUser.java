package Rest_Assured_project.masoom;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.*;

public class CreateUser {

    static String token = "e0ad33a27af2be5ef6fb60647c1f76fba10258b0373027c39f9834d16f10c821";

    @Test
    void createUser() {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Andrew leber");
        data.put("gender", "male");
        data.put("email", "andrew4230909@gmail.com");
        data.put("status", "Active");

        given().header("Authorization" ,"Bearer " + token).
                contentType(ContentType.JSON).
                body(data).
                when().post("https://gorest.co.in/public/v2/users").
                then().statusCode(201).log().all();
    }
}
