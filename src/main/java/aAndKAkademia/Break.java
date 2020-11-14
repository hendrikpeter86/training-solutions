package aAndKAkademia;

public class Break {
    public static void main(String[] args) {

        //címkézetlen break; önálló utasítás, vzérlő átadó utasítás és cikluson és switchen belül működik a break;

        int[] numbers = {65, 23, 12, 77, 99, 56, -56, 99, 141};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 99) {
                System.out.println("99 szerepel a számok között.");
                break; //hiába szerepel többször a 99, a program leáll, ha egyszer megtalálta, felelegesen nem keresi a többit, mivel a feladat csak annyi volt, hogy szerepel-e benne, nem érdekes hányszor.
            }           //ezzel időt sporolunk és nem dolgoztatjuk felesleges a gépet.

        }

        //címkézett break;

        String[] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        String[] mealsOfDay = {"reggeli", "tízórai", "ebéd", "uzsonna", "vacsora"};

        outer:
        for (String day : daysOfWeek) {
            System.out.println(day);
            inner:
            for (String meal : mealsOfDay) {
                if (day.equals("csütörtök")) {
                    break outer;
                }
                System.out.println("  " + meal);
            }
        }


    }
}
