package Rest_Assured_project.nilofarNawabi;
import static org.hamcrest.core.IsEqual.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PostBooksReq {

@Test
    void createReq(){
        RestAssured.given().body(
                        """
                        {
                             "id": 0,
                                      "title": "Book 20",
                                      "description": "Kids book",
                                      "pageCount": 255,
                                      "excerpt": "",
                                      "publishDate": "2024-11-05T17:28:29.539Z"
                        }
                        """)
                .when().post("https://fakerestapi.azurewebsites.net/api/v1/Books")
                .then()
                .statusCode(201).log().all();



    }
}
