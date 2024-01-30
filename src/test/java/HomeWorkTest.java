import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class HomeWorkTest extends BaseTest {
    @BeforeEach
    public void setUp() {
        // "Документация" по вызовам - https://restful-api.dev/
        RestAssured.baseURI = "https://restful-api.dev/";
    }

    // Ваша задача написать по одному тесту на каждый вызов:
    // 1. Для вызова GET LIST OF ALL OBJECTS проверьте,
    // что количество объектов в ответном массиве равно 13

    // 2. Для вызова GET LIST OF OBJECTS BY IDS проверьте,
    // что при вызове с параметрами id 10 и 12 (одновременно),
    // у обоих значение Capacity = 64 GB

    // 3. Для вызова GET SINGLE OBJECT с любым id сделайте "контрактный" тест

    // 4. Для вызова POST ADD OBJECT сделайте добавление новой сущности
    // с использованием класса сущности (можете использовать пример вызова с сайта)
    // и проверьте, что переданные данные присутствуют в ответе (также используя класс)

    // 5. Для вызова PUT UPDATE OBJECT сделайте класс телефона,
    // обновите сущность с id 1 или 3 и проверьте ответ

    // 6. Для вызова PATCH PARTIALLY UPDATE OBJECT проверьте
    // обновление любого поля любого понравившегося вам объекта

    // 7. Для вызова DELETE DELETE OBJECT проверьте статус ответа,
    // сообщение и что в сообщении содержится переданный id объекта
}
