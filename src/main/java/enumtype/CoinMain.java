package enumtype;

public class CoinMain {
    public static void main(String[] args) {
        Coin c = Coin.HUNDRED;

        for (Coin i: Coin.values()){  //.values sorrendben visszaadja a Coin elemeit
            System.out.println(i);

        }

        System.out.println(c.ordinal()); //az adott elem indexét mutatja meg, itt is 0-tól indul az indexelés, HUNDRED az 1-es index
        System.out.println(c.name()); //kiadja az enum nevét, de immár stringkét

        Coin c2 = Coin.valueOf("FIVE"); //Stringből csinálunk enumot
        System.out.println(c2);

        System.out.println(c2.getValue()); //itt meg  FIVE-nak az értékét adja vissza

    }
}
