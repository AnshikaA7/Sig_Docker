import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleImageTest {

    @Test
    public void checkImageTypeTest() {
        Response response = given()
                .when().get("https://sig.monotype.com/fonts/font_rend.php?id=99a73152bb189817fc6980d4d0ba4744");
        String con = response.getContentType();
        Integer statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        Assert.assertEquals(con, "image/png");

    }
}
