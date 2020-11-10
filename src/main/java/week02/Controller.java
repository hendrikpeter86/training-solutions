package week02;

import java.util.Scanner;

public class Controller {

    private Office office = new Office();

    public void readOffice(){
        System.out.println("Kérlek add meg a tárgyalók számát: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfMetingRooms = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numberOfMetingRooms; i++) {
            System.out.println("Kérem a nevet: ");
            String name = scanner.nextLine();

            System.out.println("Kérlek add meg a szélességet: ");
            int width = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Kérlek add meg a hosszúságot: ");
            int lenght = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, lenght, width);
            office.addMeetingRoom(meetingRoom);

        }

        System.out.println(office.getMeetingRooms());
    }
    public void printMenu(){
        System.out.println();
    }

    public void runMenu(){
        System.out.println("Melyik menüpontot választod? ");
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if(menuItem == 1) {
            office.printNames();
        }

        if(menuItem == 7) {
            System.out.println("Mekkoránál nagyobbat?");
            int area = scanner.nextInt();
            office.printAreasLargerThan(area);
        }

    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();

     }
}
