import org.junit.jupiter.api.*;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalculatorTest {

   StringCalculator calculator;

   @BeforeEach
   public  void init(){
       calculator = new StringCalculator();
   }

    @Test
   public void emptyStringReturnsZero() throws Exception{
       assertEquals(0,calculator.add(""));
   }

    @Test
    public void singleStringReturnsSum() throws Exception{
        assertEquals(1,calculator.add("1"));
    }

    @Test
    public void twoCharsCommaDelimitedStringReturnsSum() throws Exception{
       assertEquals(3,calculator.add("1,2"));
    }

    @Test
    public void moreThanTwoCharsCommaDelimitedStringReturnsSum() throws Exception{
        assertEquals(10,calculator.add("1,2,3,4"));
    }

    @Test
    public void CommaOrNewLineDelimitedStringReturnsSum() throws Exception{
        assertEquals(10,calculator.add("1\n2,3,4"));
    }

    @Test
    public void shouldSupportDifferentDelimiters() throws Exception {
        assertEquals(3,calculator.add("//;\n1;2"));
    }

    @Test
    public void shouldThrowExceptionOnNegetiveNum()  {
        try {
            calculator.add("1,2,-3");
        } catch (Exception e) {
            assertEquals("negatives not allowed : -3, ",e.getMessage().toString());
        }

    }

    @AfterEach
    public  void destroy(){
       calculator = null;
       System.gc();
    }





}
