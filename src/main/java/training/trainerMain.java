package training;

import java.util.Scanner;

public class trainerMain {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Year of bith?");
        int yearOfBirth = scanner.nextInt();


        Trainer trainer = new Trainer(name,yearOfBirth);

        System.out.println(trainer.getNameAndYearOfBirth());
    }
}
