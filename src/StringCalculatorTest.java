import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringCalculatorTest {

   StringCalculator calculator;

   @BeforeEach
   public void init(){
       calculator = new StringCalculator();
   }
    @Test
   public void emptyStringReturnsZero(){
       assertEquals(0,calculator.add(""));
   }



}
