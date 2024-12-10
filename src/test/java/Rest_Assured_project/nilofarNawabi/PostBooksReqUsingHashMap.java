package Rest_Assured_project.nilofarNawabi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.hamcrest.core.IsEqual.equalTo;


public class PostBooksReqUsingHashMap {

    @Test
    void createReq() {
        HashMap<String, String> data = new HashMap();

        data.put("title", "book 25");
        data.put("description", "Kids book");
        data.put("pageCount", "255");
        data.put("excerpt", "nilo");
        data.put("publishDate", "2024-11-05T17:28:29.539Z");


        RestAssured.given().contentType(ContentType.JSON)
            .body(data)

                .when().post("https://fakerestapi.azurewebsites.net/api/v1/Books")
                .then()
                .statusCode(200)
                .body("title", equalTo("book 25"))
                .body("description", equalTo("Kids book"))
                .body("pageCount", equalTo(255))
                .body("excerpt", equalTo("nilo"))
                .log().all();


    }
}
