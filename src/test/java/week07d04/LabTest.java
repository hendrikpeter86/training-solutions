package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class LabTest {

    @Test
    void testConstructor(){
        Lab lab = new Lab("Metódus túlterhelés");

        assertEquals("Metódus túlterhelés", lab.getTitle());
        assertEquals(null, lab.getCompletedAt());
        assertFalse(lab.isCompleted());
    }

    @Test
    void testConstructorWithParameter(){
        Lab lab = new Lab("Metódus túlterhelés", LocalDate.of(2020,12,14));

        assertEquals("Metódus túlterhelés", lab.getTitle());
        assertEquals(LocalDate.of(2020,12,14), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }

    @Test
    void testComplete(){
        Lab lab = new Lab("Metódus túlterhelés");
        lab.complete(); // 23:59.59
        // Éjfél
        assertTrue(lab.isCompleted());
        // 00:00.01
        assertEquals(LocalDate.now(), lab.getCompletedAt());
    }

    @Test
    void testCompleteWithLocalDate() {
        Lab lab = new Lab("Metódus túlterhelés");
        lab.complete(LocalDate.of(2020, 12, 13));
        assertTrue(lab.isCompleted());
        // 00:00.01
        assertEquals(LocalDate.of(2020, 12, 13), lab.getCompletedAt());
    }

    @Test
    void testIsTitleLongerThanTwoCharacter (){
        Lab lab1 = new Lab("Metódus túlterhelés");

        assertTrue(lab1.isTitleLongerThanTwoCharacter());

        Lab lab2 = new Lab("Me");

        assertFalse(lab2.isTitleLongerThanTwoCharacter());

    }
}
