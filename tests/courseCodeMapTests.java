import model.CourseCodeMap;
import org.junit.jupiter.api.Test;

/**
 * @author Jolien Franke <j.franke@st.hanze.nl>
 * Purpose of program
 */

public class courseCodeMapTests {
    CourseCodeMap courseCodeMap = new CourseCodeMap();

    @Test
    public void oneKeyOneValueTest() {
//        Arrange
        courseCodeMap.readFile("resources/vakcodes.txt");

        Integer expectedEcts = 6;

//        Act
        Integer generatedEcts = courseCodeMap.getValue("CS101");

//        Assert
        assert generatedEcts == expectedEcts;
    }

    @Test
    public void noKeyPresent() {
        //        Arrange
        courseCodeMap.readFile("resources/vakcodes.txt");

        Integer expectedEcts = null;

//        Act
        Integer generatedEcts = courseCodeMap.getValue("CS999");

//        Assert
        assert generatedEcts == expectedEcts;
    }

    @Test
    public void findByValue() {
        //        Arrange
        courseCodeMap.readFile("resources/vakcodes.txt");

        Boolean expected = true;

//        Act
        boolean generated = courseCodeMap.checkIfValueIsPresent(10);

//        Assert
        assert generated == expected;
    }
}
