package week07d03;

import org.junit.jupiter.api.Test;
import week07d03.NumberList;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class isIncreasingTest {


    @Test
    public void isIncreasingTest(){
        NumberList nl = new NumberList();

        assertTrue(nl.isIncreasing(Arrays.asList(-1,1,2,4,5)));
        assertTrue(nl.isIncreasing(Arrays.asList(-100,1,20,40,556)));
        assertFalse(nl.isIncreasing(Arrays.asList(1,2,9,5)));
        assertFalse(nl.isIncreasing(Arrays.asList(1,2,-4,5)));
    }
}
