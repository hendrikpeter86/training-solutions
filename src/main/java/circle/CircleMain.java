package circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg az első kör átmérőjét: ");
        Circle cirle1 = new Circle(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Az első kör kerülete: " + cirle1.perimeter());
        System.out.println("Az első kör területe: " + cirle1.area());

        System.out.println("Kérlek add meg a második kör átmérőjét: ");
        Circle cirle2 = new Circle(scanner.nextInt());
        scanner.nextLine();

        System.out.println("A második kör kerülete: " + cirle2.perimeter());
        System.out.println("A második kör területe: " + cirle2.area());


    }
}
