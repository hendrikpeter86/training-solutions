package AAndKAkademia;

public class Continue {

    public static void main(String[] args) {

        //címkézetlen continue
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue;  //continue utáni utasítást kihagyja bármi is van mögötte
            }
            System.out.println(i);
        }

        //címkézett continue, akkor van értelme, ha nem a belső ciklust akarjuk átugrani, hanem a külsőt (cimkék nélkül a belsőt ugraná át)
        //viszonylag ritkán használjuk (szerencsére :))
        String[] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        String[] mealsOfDay = {"reggeli", "tízórai", "ebéd", "uzsonna", "vacsora"};

        outer:  //csak elneveztem outernek
        for (String day : daysOfWeek) {
            System.out.println(day);
            inner: //csak elneveztem innernek
            for (String meal : mealsOfDay){
                if (day.equals("kedd")) {
                    continue outer;  //így a külső ciklust lépteti, nem a belsőt
                }
                System.out.println("  " + meal);
            }
        }


    }
}
