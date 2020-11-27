package AAndKAkademia;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();  //ez "nyeli el" az entert a beütött szám karakter(ek) után
        System.out.println("A megadott szám: " + number);

        System.out.println("Kérem adjon meg egy leegőpontos számot: ");
        double myDoubleNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(("A megadott szám: " + myDoubleNumber));

        System.out.println("Kérem, adjon meg egy szöveget: ");
        String text = scanner.nextLine();
        System.out.println("A megadott szöveg: " + text);
    }
}
