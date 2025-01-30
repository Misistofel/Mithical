package airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineTest {

    @Test
    public void createAirline() {
        String endPoint = "https://api.instantwebtools.net/v1/airlines";
// changed        String payload = PayLoads.getCreateAirlinePayloadFromString("252d3bca-d9bb-476c-9a97-562d685e235c", "Sri Lankan Airways",
//                "Sri Lanka", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
//                "From Sri Lanka", "Katunayake, Sri Lanka", "www.srilankaaairways.com", "1990");

       Map<String, Object> payload= PayLoads.getCreateAirlinePayloadFromMap("252d3bca-d9bb-476c-9a97-562d685e235c", "Sri Lankan Airways",
                "Sri Lanka", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "From Sri Lanka", "Katunayake, Sri Lanka", "www.srilankaaairways.com", "1990");
                Response response = RestUtils.performPost(endPoint,payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(),200);

    }

}
