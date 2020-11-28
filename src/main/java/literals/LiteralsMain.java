package literals;

public class LiteralsMain {

    public static void main(String[] args) {
 /*       System.out.println(0b1111_1111); //bináris egész szám, kezdeni 0b
        System.out.println(0377); //oktális 8-as számrendszerben egész szám, kezdeni 0
        System.out.println(0xff); //hexadecimális 16-os számrendszerben egész szám, kezdeni 0x

        long l = 100_000_000_000L; //olvashatóság miatt lehet _ jelet tenni és a végére kell L betű, célszerű nagyot, mert könnyen összekverhető az egyesel a kis l

        System.out.println(l);

        System.out.println(-12e4); //exponenciális formában megadott szám. -12-szor 10 a negyediken

        float f = 1.0F; //kell a F mögé, olvashatóság miatt legyen nagy F

        System.out.println(f);

        System.out.println("Hello \n\"World\"!");  // \n a sortörés, idézőjelet is escapelni kell, erre való a \

*/

        String a = "" + 1 + 2;
        String b = Integer.toString(1) + Integer.toString(2);
        String c = 1 + "" + 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double quotient = 3d / 4d;

        System.out.println(quotient);

        long big = 3_244_444_444L;

        System.out.println(big);

        String word = "title".toUpperCase();
       // word.toUpperCase(); //így nem fog működni, mert String immutable, megváltozhatatlan

        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));


    }
}
