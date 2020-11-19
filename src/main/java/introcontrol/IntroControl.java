package introcontrol;

public class IntroControl {

    /*    public static int main(String[] args) {

     *//*     int x = new Random().nextInt(1000);

        if ((x % 2) == 0) {
            System.out.println("Even: " + x);
        }else {
            System.out.println("Odd " + x);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);*//*
    }*/


    public int subtractTeIfGreterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if (name == "Joe") {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {
        int commission = 10;
        if (sale > 1_000_000) {
            return sale / commission;
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (prev <= next) {
            return next - prev;
        } else {
            return 10_000 - prev + next;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (b > a) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int j = a; j >= b; j--) {
                System.out.println(j);
            }
        }
    }

    public void printOddNumbers(int max){
        for(int i = 1; i <= max; i += 2){
            System.out.println(i);
        }
    }



}
