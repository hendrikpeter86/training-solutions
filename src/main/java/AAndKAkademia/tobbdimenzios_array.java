package AAndKAkademia;

public class tobbdimenzios_array {

    public static void main(String[] args) {


      //létrehozás
        int[][] numbers = new int[4][6];  //mindegy melyik sor vagy sozlop, de legyen az első a sor, második az oszlop

        //elemek tárolása a tömbben
        numbers[1][2] = 42;

        //elemek kolvasása a tömbből
        System.out.println(numbers[1][2]);

        String[] names = {"John", "Aaron", "Valerian", "Antony"};
        //ezt lehetne így is persze: String[] names = new String[4]; aztán külön egyesével megadjuk az értékét,de így egyszerűbb
    }
}
