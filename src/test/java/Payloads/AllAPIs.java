package Payloads;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AllAPIs {
    public static int statusCode;
    public static void getAPIMethod () throws InterruptedException {
        Response response = RestAssured.given().when().get("https://reqres.in/api/users?page=2")
                            .then().log().all().extract().response();
        JsonPath res = new JsonPath(response.asString());
        System.out.println(response);
        statusCode = response.getStatusCode();
        System.out.println("Get method : "+statusCode);
    }

    public static void postAPIMethod() throws InterruptedException{
        Response response = RestAssured.given()
                .header("Accept","application/json").when()
                .queryParam("name","morpheus")
                .queryParam("job","leader")
                .get("https://reqres.in/api/users").then()
                .log().all().extract().response();

        JsonPath res = new JsonPath(response.asString());
        System.out.println(res);
        statusCode = response.getStatusCode();
        System.out.println("post method : "+statusCode);
    }



}
