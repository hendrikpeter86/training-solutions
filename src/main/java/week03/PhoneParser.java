package week03;

public class PhoneParser {
    private String parse;

    public static void main(String[] args) {


        Phone phone = new Phone("30", "1234567");

        System.out.println("A megadott telefonszám: " + phone.getPrefix() + "-" + phone.getNumber());
    }
}
