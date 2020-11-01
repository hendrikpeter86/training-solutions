package aAndKAkademia;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {

        //egydimenziós tömb létrahozása, 10 elemmel, amíg nincs értéke, akkor az alapértelmezett értékét adja (int-nél 0-t)
        int[] numbers = new int [10];

        //tömb feltöltése
        numbers[0] = 4;                 //Fontos, mivel int, mindegyik egész szám. egy adot tömbben csak azonos fajták lehetnek.
        numbers[1] = 12;
        numbers[2] = 7;
        numbers[3] = -6;
        numbers[4] = 53;
        numbers[5] = 42;
        numbers[6] = 31;
        numbers[7] = 0;
        numbers[8] = -100;
        numbers[9] = 72;

        //tömb elemeinek lekérdezése
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);

        System.out.println(Arrays.toString(numbers));   //beépített metódus, amit meghívok, mint Scannert
    }
}
