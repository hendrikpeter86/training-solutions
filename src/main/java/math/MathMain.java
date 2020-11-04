package math;

import java.util.Random;

public class MathMain {

    public static void main(String[] args) {
        System.out.println(Math.PI);  //Pi kiírása
        System.out.println(Math.round(10.5));  //kerekítés a matematika szabályai szerint
        System.out.println(Math.abs(-10));  //abszolút érték számítás
        System.out.println(Math.max(-10, 10));  //két szám közül a nagyobb kiválasztása

        System.out.println(new Random().nextInt(100)); //pszeudo random számot ad vissza 0 és 100 között, de 100-at sosem
        System.out.println(new Random(13).nextInt(100)); //seed teszteléshez nagyon jó, random mindig ugyanaz lesz
    }
}
