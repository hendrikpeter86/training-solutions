package week02;

public class PhoneMain {

    public static void main(String[] args) {
        Phone phone1 = new Phone("apple", 8);
        Phone phone2 = new Phone("Samsung", 16);

        System.out.println(phone1.type + ", " + phone1.mem);
        System.out.println(phone2.type + ", " + phone2.mem);
    }


}
