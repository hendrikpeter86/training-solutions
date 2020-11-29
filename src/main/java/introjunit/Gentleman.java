package introjunit;

import java.util.Scanner;

public class Gentleman {

   public String sayHello(String name){
       if (name == null){
           return "Hello Anonymus";
       }else{
           return "Hello " + name;
       }

   }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek add meg a neved :) ");
        String koszones = gentleman.sayHello(scanner.nextLine());
        System.out.println(koszones);
    }


}
