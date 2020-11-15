package SanFranciscobolJottem;

public class Kivetelek {

    public static void main(String[] args) {

        try {
            int a = 3;  // megpróbálom ami itt van
        } catch (Exception e) {
            System.out.println("Gáz van " + e); //ha nem sikerült, akkor jövök a catchbe
        }finally { //nem kötelező megadni (try catch kötelező), de ha megadom függetlenül attól, hogy fent mi történik ez lesz az eredmény, amit ide megadok

        }

        //ennek akkor van értelme, ha pl. fájlt akarok feltölteni, de nem találja a fájl.
    }
}
