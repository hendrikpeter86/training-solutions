package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy nevet: ");
        String nev = scanner.nextLine();

        System.out.println("Kérek egy e-mail címet: ");
        String email = scanner.nextLine();

        System.out.println("Megadott név: " + nev + " Megadott e-mail cím: " + email);
    }
}