import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedTestEnumSource {
    @ParameterizedTest(name = "Check blanks {0}")
    @EnumSource(value = Values.class, names = {"A.."} ,mode = EnumSource.Mode.MATCH_ALL)
    public void checkBlanksWithPlaceholder(Object value) {
        //Assertions.assertTrue(StringUtils.isBlank(value));
        System.out.println(value.toString());
    }

    enum Values{
        ABC, XYZ, WXY, PQX
    }
}
