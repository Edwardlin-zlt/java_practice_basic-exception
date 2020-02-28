import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JsonUtil {

    private JsonUtil() {
    }

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String convertToJson(Object object) {
        //TODO: change the code to pass the test

        String s;
        try {
            s = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new ValueReadException("Read value error");
        }
        return s;
    }
}
