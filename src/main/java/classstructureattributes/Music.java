package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kedvenc előadó?");
        song.band = scanner.nextLine();
        System.out.println("Dal címe?");
        song.title = scanner.nextLine();
        System.out.println("Hossza percben?");
        song.lenght = scanner.nextLine();

        System.out.println(song.band + " - " + song.title + ", (" + song.lenght + " perc)!");
    }
}
