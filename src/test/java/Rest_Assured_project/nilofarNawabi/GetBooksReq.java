package Rest_Assured_project.nilofarNawabi;
import static org.hamcrest.core.IsEqual.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetBooksReq {
  @Test
void getBooks(){
      RestAssured.given()
              .when().get("https://fakerestapi.azurewebsites.net/api/v1/Books")
              .then().statusCode(200)
              .and().body("title[Book 1]", equalTo("Book 1")).log().all();
  }






}
