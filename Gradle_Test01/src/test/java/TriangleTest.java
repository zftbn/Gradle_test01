import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TriangleTest {

    @Test
    @DisplayName(value="一般三角形")
    void testTriangle() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 4, 6);
        assertEquals("一般三角形", type);
    }

    @Test
    @DisplayName(value="等边三角形")
    void equallaterialTriangle() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 3, 3);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName(value="非三角形")
    void notTriangle() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 3, 6);
        assertEquals("非三角形", type);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4,6,一般三角形",
            "3,3,3,等边三角形",
            "3,3,6,非三角形"
    })
    void paramTriangle(int a, int b,int c,String expected) {
        Triangle triangle = new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形一般边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形一般边界测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest(int m,int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形健壮性边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮性边界测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest1(int m,int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形最坏情况一般边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形最坏情况一般边界测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest2(int m,int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形最坏情况健壮性边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形最坏情况健壮性边界测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest4(int m,int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
}
