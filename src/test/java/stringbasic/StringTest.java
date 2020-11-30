package stringbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringTest {

    @Test
    public void testEquals(){
        String s = "John Doe";
        s = s.toUpperCase();
        assertEquals(s, "JOHN DOE");

    }

}
