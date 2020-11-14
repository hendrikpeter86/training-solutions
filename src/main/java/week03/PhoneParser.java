package week03;

public class PhoneParser {
    private String parse;

    public Phone parse(String s){
        // S = 30-1234567
        String prefix = s.substring(0, 2);
        String  number = s.substring(3);
        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {
        String s = "70-1234654";
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parse(s);
        System.out.println(phone.getPrefix() + " " + phone.getNumber());
    }

}
