package Rest_Assured_project.Rafi;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class listuseres{

@Test
void Getclassnew() {


 Response res =  given()

            .when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
//            .then()
//            .statusCode (200)
//            .body("[2].id", equalTo(3))
//            .body("[2].title", equalTo("Activity 3")).log().all();

    if (res.statusCode() == 200){
    JsonPath jsonpath = res.jsonPath();
    List<Object> titles = jsonpath.get();

  for(Object dueDate : titles){
      System.out.println(dueDate);
  }

        }

}






}