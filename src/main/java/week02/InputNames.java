package week02;

import java.util.Scanner;

public class InputNames {


    public static void main(String[] args) {

        String[] names = new String[5];
        for (int i = 1; i <= 5 ; i++ ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérem adjon meg egy nevet: ");
            names[i] = scanner.nextLine();

        }

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
