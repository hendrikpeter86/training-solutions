package week03;

import java.util.Scanner;

public class ReadNumbers {

    public int add(int i, int j){
       if(i < 0) {
           throw new IllegalArgumentException("nem lehet negatív szám");
       }
        return i + j;
    }

    public static void main(String[] args) {
        ReadNumbers readNumbers = new ReadNumbers();
        readNumbers.add(5,6);
        readNumbers.add(-5, 6);



        System.out.println("Kérlek adj meg egy számot:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            int number = Integer.parseInt(line);
            System.out.println(number);
        }
        catch (NumberFormatException ne) {
            System.out.println("EZ NEM SZÁM!");
        }
    }
}
