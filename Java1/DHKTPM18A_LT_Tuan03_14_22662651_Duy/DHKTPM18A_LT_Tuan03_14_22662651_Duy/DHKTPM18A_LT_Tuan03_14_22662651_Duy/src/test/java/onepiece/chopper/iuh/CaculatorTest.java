package onepiece.chopper.iuh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.InputMismatchException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;


class CaculatorTest {
    @Test
    void sumTest(){
        int actual = Caculator.sum(1,4,7,8);
        int expected1 = 20;
        assertEquals(expected1,actual);
    }

//    @Test
//    void divTest(int a,int b,float expected2) {
//        float actual = Caculator.div(a,b);
//        assertEquals(expected2,actual);
//    }

    /**
     * @param a
     * @param b
     * @param expected
     */
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "5,2,2.5",
            "2,4,0.5",
            "0,5,0.0"
    })


    @Test
     void TestdivException(){
        Exception exception = assertThrows(InputMismatchException.class,() -> {
            Caculator.div(5,0);
        });
        String expected3 = "Cannot divide by zero";
        assertEquals(expected3,exception.getMessage());
    }
}