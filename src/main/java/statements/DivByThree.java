package statements;

import java.util.Scanner;

public class DivByThree {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Kérem adjon meg egy egész számot és én megvizsgálom, osztható-e 3-al: ");
        int i = scanner.nextInt();

        System.out.println(i % 3 == 0 ? "osztható" : "nem osztható");

    }
}
