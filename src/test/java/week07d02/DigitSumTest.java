package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitSumTest {

    @Test
    public void DigitSumTest(){
        DigitSum digitSum = new DigitSum();
        assertEquals(6, digitSum.sumOfDigits(222));
        assertEquals(12, digitSum.sumOfDigits(525));
        assertEquals(9, digitSum.sumOfDigits(432));
    }
}
