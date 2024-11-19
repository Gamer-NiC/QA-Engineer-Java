package com.qa_engineer_java;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


// Проверка методов из папки Request Methods в коллекции Postman Echo
public class Lesson_9 {
   private static final String BASE_URL = "https://postman-echo.com";

   // Тест метода GET
   @DisplayName("Проверка метода GET")
   @Test
   public void testGetMethod() {
      given()
              .baseUri(BASE_URL)
              .when()
              .get("/get?foo1=bar1&foo2=bar2")
              .then()
              .assertThat()
              .statusCode(200)
              .body("args.foo1", equalTo("bar1"))
              .body("args.foo2", equalTo("bar2"))
              .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))
              .log().all();
   }

   // Тест метода POST с raw JSON
   @DisplayName("Проверка метода POST с raw JSON")
   @Test
   public void testPostMethodRawJson() {
      String body = "{\n    \"test\": \"value\"\n}";
      given()
              .baseUri(BASE_URL)
              .contentType(ContentType.JSON)
              .body(body)
              .when()
              .post("/post")
              .then()
              .statusCode(200)
              .body("data.test", equalTo("value"))
              .body("url", equalTo("https://postman-echo.com/post"))
              .log().all();
   }

   // Тест метода POST с x-www-form-urlencoded
   @DisplayName("Проверка метода POST с x-www-form-urlencoded")
   @Test
   public void testPostMethodXWwwFormUrlencoded() {
      given()
              .baseUri(BASE_URL)
              .contentType("application/x-www-form-urlencoded;charset=UTF-8")
              .formParam("foo1", "bar1")
              .formParam("foo2", "bar2")
              .when()
              .post("/post")
              .then()
              .statusCode(200)
              .body("form.foo1", equalTo("bar1"))
              .body("form.foo2", equalTo("bar2"))
              .body("url", equalTo("https://postman-echo.com/post"))
              .log().all();
   }

   // Тест метода PUT
   @DisplayName("Проверка метода PUT")
   @Test
   public void testPutMethod() {
      String body = "This is expected to be sent back as part of response body.";
      given()
              .baseUri(BASE_URL)
              .body(body)
              .when()
              .put("/put")
              .then()
              .assertThat()
              .statusCode(200)
              .body("data", equalTo(body))
              .body("url", equalTo("https://postman-echo.com/put"))
              .log().all();
   }

   // Тест метода PATCH
   @DisplayName("Проверка метода PATCH")
   @Test
   public void testPatchMethod() {
      String body = "This is expected to be sent back as part of response body.";
      given()
              .baseUri(BASE_URL)
              .body(body)
              .when()
              .patch("/patch")
              .then()
              .assertThat()
              .statusCode(200)
              .body("data", equalTo(body))
              .body("url", equalTo("https://postman-echo.com/patch"))
              .log().all();
   }

   // Тест метода DELETE
   @DisplayName("Проверка метода DELETE")
   @Test
   public void testDeleteMethod() {
      given()
              .baseUri(BASE_URL)
              .when()
              .delete("/delete")
              .then()
              .assertThat()
              .statusCode(200)
              .body("url", equalTo("https://postman-echo.com/delete"))
              .log().all();
   }
}
