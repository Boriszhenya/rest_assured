import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    @AfterEach
    public void tearDown() {
        RestAssured.reset();
    }
}
