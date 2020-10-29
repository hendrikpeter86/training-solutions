package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot: ");
        int egyikSzam = scanner.nextInt();

        System.out.println("Kérek még egy számot: ");
        int masikSzam = scanner.nextInt();

        System.out.println("Megadott két szám összege: ");
        System.out.println(egyikSzam + masikSzam);

    }



}
