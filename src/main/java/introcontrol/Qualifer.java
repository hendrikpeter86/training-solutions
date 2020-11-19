package introcontrol;

import java.util.Scanner;

public class Qualifer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot: ");
        int number = scanner.nextInt();

        if (number > 100){
            System.out.println("nagyobb, mint száz");
        }else if(number == 100){
            System.out.println("pontosan száz");
        }else{
            System.out.println("kisebb, mint száz");
        }


    }
}
