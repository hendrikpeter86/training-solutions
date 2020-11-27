package AAndKAkademia;

public class ControlFlowStatementDemo {

    public static void main(String[] args) {

        System.out.println("Üdv!");
        System.out.println("Ma ");
        int dayOfMonth = 2;

        if (dayOfMonth == 2){           //kerek zárójelbe csak boleean értéket írhatok  //if az egy kulcsszó
            System.out.println("h");
            System.out.println("é");
            System.out.println("t");
            System.out.println("f");
            System.out.println("ő");
        }
        if (dayOfMonth == 3)            //ha csak egy utasítás van, nem kötelező a {}, de ajánlott
            System.out.println("kedd");

        if (dayOfMonth == 4){
            System.out.println("szerda");
        }
        System.out.println(" van.");
        System.out.println("Viszlát!");


        //if else

        int dayOfWeek = 7;

        if(dayOfWeek < 6){          //eldöntendő kérdéseket lehet feltenni, igaz vagy hamis
            System.out.println("Hétköznap van.");  //ha if igaz, akkor lefut
        } else {
            System.out.println("Hétvége van.");  //ha in nem igaz, akkor az else fut le
        }


        //if else if

        int number = 72;

        if (number < 0){            //kisebb-e mint nulla, ha igaz végrehajtja az itteni parancsot
            System.out.println("A szám negatív.");
        }else if (number > 0){      //ha a fenti if hamis, akkor jön tovább ide, ha ez igaz, akkor kiíírja a parancsot
            System.out.println("A szám pozitív");
        }else{                      //ha a második if sem teljesült, akkor végrhajtja ezt
            System.out.println("A szám nulla.");
        }

    }
}
