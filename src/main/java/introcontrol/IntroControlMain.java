package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTeIfGreterThanTen(8));
        System.out.println(introControl.subtractTeIfGreterThanTen(10));
        System.out.println(introControl.subtractTeIfGreterThanTen(11));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("John"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(2_589_654));
        System.out.println(introControl.calculateBonus(249_655));

        System.out.println(introControl.calculateConsumption(456, 556));
        System.out.println(introControl.calculateConsumption(9999, 49));

        introControl.printNumbers(6);

        introControl.printNumbersBetween(112, 122);

        introControl.printNumbersBetweenAnyDirection(10,25);
        introControl.printNumbersBetweenAnyDirection(1210,1198);

        introControl.printOddNumbers(7);
        introControl.printOddNumbers(12);

    }
}
