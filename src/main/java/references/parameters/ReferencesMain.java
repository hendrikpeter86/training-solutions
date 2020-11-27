package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {

        Person person1;
        Person person2;

       person1 = new Person("Peter", 21);

       person2 = person1;

       person2.setName("Laci");

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        int number1;
        int number2;

        number1 = 24;
        number2 = number1;
        number2++;

        System.out.println(number1);
        System.out.println(number2);

        person2 = new Person("Zolika", 18);

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());



    }
}
