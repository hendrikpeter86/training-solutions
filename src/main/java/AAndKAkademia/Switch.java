package AAndKAkademia;

public class Switch {

    public static void main(String[] args) {


    int dayOfWeek = 3;

    switch(dayOfWeek) {   //()-ben megadom melyik változó mentén ágazzon el
        case 1:
            System.out.println("Hétfő");
            break;
        case 2:
            System.out.println("Kedd");
            break;
        case 3:
            System.out.println("Szerda");
            break;   //fall through logick, "keresztülesésilogika", csak egy belépési pontot ad meg az érték, de ha breaket rakunk möge, az megállítja
        case 4:
            System.out.println("Csütörtök");
            break;
        case 5:
            System.out.println("Péntek");
            break;
        case 6:
            System.out.println("Szombat");
            break;
        case 7:
            System.out.println("Vasárnap");
            break;
    }

    int anotherDayOfWeek = 3;
    switch (anotherDayOfWeek) {  //szándékosan hsználjuk a break elhagyást
        case 1:
        case 2:
        default:  //default lehet bárhol és nem csak a végén, mint az else és nem is kötelező
            System.out.println("Ismeretlen");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Hétköznap");
            break;
        case 6:
        case 7:
            System.out.println("Hétvége");
            break;
    }
        int againDayOfWeek = 1;
        String nameOfDay = switch (againDayOfWeek) {
         case 1 -> {
             //...
             //...bármilyen más művelet megadható
             yield "Hétfő";}  //yield: új utasítás, eredményez
         case 2 -> "Kedd";
         case 3 -> "Szerda";
         case 4 -> "Csütörtök";
         case 5 -> "Péntek";
         case 6 -> "Szombat";
         case 7 -> "Vasárnap";
         default -> "Ismeretlen";  //itt elvárja a default esetet
     }; //; utasításnak egy része csak a switch itt
        System.out.println(nameOfDay);

    }


    }




