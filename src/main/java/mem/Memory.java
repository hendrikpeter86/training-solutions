package mem;

public class Memory {

    public void a () {
        int xa= 1;
        System.out.println("a" + xa);
        b();
    }
    public void b () {
        int xb= 1;
        System.out.println("b" + xb);
        c();
    }
    public void c () {
        int xc= 1;
        System.out.println("c" + xc);

    }
    public static void main(String[] args) {  //main-ből a "static" miatt csak példányosítás után tudok metódust hívni.
        Memory m = new Memory();
        m.a();
    }
}
