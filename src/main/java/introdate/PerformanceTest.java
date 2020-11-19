package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {


        Performance performance = new Performance(LocalDate.of(2015, 05, 04), "Jazzband", LocalTime.of(17, 00), LocalTime.of(21,00));
        System.out.println(performance.getInfo());
        }
}
