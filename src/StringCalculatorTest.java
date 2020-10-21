import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringCalculatorTest {

   StringCalculator calculator;

   @BeforeEach
   public  void init(){
       calculator = new StringCalculator();
   }

    @Test
   public void emptyStringReturnsZero(){
       assertEquals(0,calculator.add(""));
   }

    @Test
    public void singleStringReturnsSum(){
        assertEquals(1,calculator.add("1"));
    }

    @Test
    public void twoCharsCommaDelimitedStringReturnsSum(){
       assertEquals(3,calculator.add("1,2"));
    }

    @Test
    public void moreThanTwoCharsCommaDelimitedStringReturnsSum(){
        assertEquals(10,calculator.add("1,2,3,4"));
    }

    @AfterEach
    public  void destroy(){
       calculator = null;
       System.gc();
    }





}
