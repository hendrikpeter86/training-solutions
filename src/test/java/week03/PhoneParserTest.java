package week03;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Teszt osztály
public class PhoneParserTest {

    // Teszt metódus = teszt eset
    @Test
    void testParse() {
        // Given - előkészítés
        PhoneParser parser = new PhoneParser();
        String s = "80-6666666";

        //When - a metódus meghívása
        Phone phone = parser.parse(s);

        //System.out.println(phone);  ez nem tesztesetbe való, mert ember kell hozzá!

        assertEquals("80-6666666", phone.toString());  //assertThat helyett ezt használni
    }
}

