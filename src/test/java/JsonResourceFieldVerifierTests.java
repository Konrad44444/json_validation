import static org.junit.jupiter.api.Assertions.assertFalse;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import com.remitly.FileReader;
import com.remitly.JsonVerifier;

public class JsonResourceFieldVerifierTests {
    private static final String RESOURCES_PATH = "src\\test\\resources\\";

    @Test
    public void givenJsonWithSingleAsteriskInResourceField_expoectFalse() {
        String fileName = "jsonWithSingleAsteriskInResourceField.json";

        JSONObject jsonObject = FileReader.readJSONFromFile(RESOURCES_PATH + fileName);

        assertFalse(JsonVerifier.verifyResourceField(jsonObject));
    }
}