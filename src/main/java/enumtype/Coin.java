package enumtype;

public enum Coin {  //M.o.n használható pénzérmék, névadási konvenciók értelmében csupa nagybetűk
    TWOHUNDRED(200), HUNDRED(100), TWENTY(20), TEN(10), FIVE(5); //konstrukto után be kellett írni mögé záójelbe az értékét, mert hibát jelzett

    //érdemes final kulcsszóval attributomat adni és csak lekérdező metódusokat adni, mivel az itteni értékek konstansok

    private final int value; //hibát jelez, mert értéket kell neki adni, amit konstruktorral tudunk egy sorral lejjebb

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
