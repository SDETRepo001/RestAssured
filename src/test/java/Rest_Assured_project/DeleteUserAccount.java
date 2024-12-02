package Rest_Assured_project;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserAccount {
    @Test
    public void deleteUser(){
        given()
                .when()
                .delete("https://reqres.in/api/users/459")
                .then().statusCode(204).log().all();
    }

}
