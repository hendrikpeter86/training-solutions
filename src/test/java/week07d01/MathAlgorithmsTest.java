package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {

    @Test
    public void isPrimeTest(){
        assertFalse(MathAlgorithms.isPrime(1));
        assertFalse(MathAlgorithms.isPrime(4));
        assertFalse(MathAlgorithms.isPrime(28));
        assertTrue(MathAlgorithms.isPrime(7));
        assertTrue(MathAlgorithms.isPrime(17));
    }
}
