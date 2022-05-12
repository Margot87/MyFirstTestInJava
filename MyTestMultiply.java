import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTestMultiply {

    @Test
    void shouldMultiplyTwoNumbers(){

        //given
        final double firstNumber = 5;
        final double secondNumber = 3;

        //when
        final double multiplicationResult = firstNumber * secondNumber;

        //then
        assertEquals(15, multiplicationResult);


    }


}
