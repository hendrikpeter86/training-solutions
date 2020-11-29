package introjunit;

public class Gentleman {

   public String sayHello(String name){
       if (name == null){
           return "Hello Anonymus";
       }else{
           return "Hello " + name;
       }

   }
/*

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        String koszones = gentleman.sayHello(null);
        System.out.println(koszones);
    }
*/

}
