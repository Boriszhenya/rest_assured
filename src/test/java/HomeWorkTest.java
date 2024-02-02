import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class HomeWorkTest extends BaseTest {
    @BeforeEach
    public void setUp() {
        // "Документация" по вызовам - https://restful-api.dev/
        RestAssured.baseURI = "https://api.restful-api.dev/";
    }

    // Ваша задача написать по одному тесту на каждый вызов:
    // 1. Для вызова GET LIST OF ALL OBJECTS проверьте,
    // что количество объектов в ответном массиве равно 13

    @Test
    public void arraysMatchersTest() {
        String all = "*";
        given()
                .when()
                .get("/objects")
                .then().assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .log().all()
                .body("name", hasSize(6));
    }


    // 2. Для вызова GET LIST OF OBJECTS BY IDS проверьте,
    // что при вызове с параметрами id 10 и 12 (одновременно),
    // у обоих значение Capacity = 64 GB

    @Test
    public void searchTwoId() {
        String id1 = "10";
        String id2 = "12";
        given()
                .pathParam("id1", id1)
                .pathParam("id2", id2)
                .when()
                .get("/objects?id={id1}&id={id2}")
                .then().assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .log().all()
                .body("[0].data.Capacity", equalTo("64 GB"))
                .body("[1].data.Capacity", equalTo("64 GB"));
    }


    // 3. Для вызова GET SINGLE OBJECT с любым id сделайте "контрактный" тест

    @Test
    public void SchemeValidationTest() {
        String postId = "13";
        given()
                .pathParam("id", postId)
                .when()
                .log().all()
                .get("/objects/{id}")

                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body(matchesJsonSchemaInClasspath("scheme.json"));
    }


    // 4. Для вызова POST ADD OBJECT сделайте добавление новой сущности
    // с использованием класса сущности (можете использовать пример вызова с сайта)
    // и проверьте, что переданные данные присутствуют в ответе (также используя класс)





    // 5. Для вызова PUT UPDATE OBJECT сделайте класс телефона,
    // обновите сущность с id 1 или 3 и проверьте ответ

    // 6. Для вызова PATCH PARTIALLY UPDATE OBJECT проверьте
    // обновление любого поля любого понравившегося вам объекта

    // 7. Для вызова DELETE DELETE OBJECT проверьте статус ответа,
    // сообщение и что в сообщении содержится переданный id объекта
    @Test
    public void deleteTest() {
        String postId = "6";
        given().pathParam("id", postId)

                .when()
                .delete("/objects/{id}")
                .then()
                .log().all()
                .statusCode(200);
    }

}
