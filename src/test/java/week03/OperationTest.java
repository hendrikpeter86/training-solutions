package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {


    @Test
    void testGetResult(){
        //Given
        Operation op = new Operation("16+32");
        //When
        int result = op.getResult();
        //Than
        assertEquals(48, result);
    }

    @Test
    void testGetResultWithSpaces(){
        //Given
        Operation op = new Operation("  16   +  32");
        //When
        int result = op.getResult();
        //Than
        assertEquals(48, result);
    }
}
