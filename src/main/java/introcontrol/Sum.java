package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bekérek Öntől 5 db számot és összeadom az értéküket!");
        System.out.println("Kérem adja meg az első számot: ");
        int numberOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg az második számot: ");
        int numberTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg az harmadik számot: ");
        int numberThree = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg az negyedik számot: ");
        int numberFour = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg az ötödik számot: ");
        int numberFive = scanner.nextInt();
        scanner.nextLine();

        int sumNumbers = numberOne + numberTwo + numberThree + numberFour + numberFive;

        System.out.println("A megadott 5 db szám összege: " + sumNumbers);


 /*            ciklussal így lehet túlbonyolítani:

                System.out.println("Adj meg öt számot!");
                Scanner scanner = new Scanner(System.in);
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    System.out.println("Add meg a " + (i + 1) + ". számot!");
                    int number = scanner.nextInt();
                    sum += number;
                }
                System.out.println("Az összeg: " + sum);*/
        }


    }




