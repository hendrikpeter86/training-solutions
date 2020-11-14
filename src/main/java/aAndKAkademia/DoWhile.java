package aAndKAkademia;

public class DoWhile {

    public static void main(String[] args) {

        int i = 30;

        do {
            System.out.println(i);
            i /= 2;
        } while (i > 0);

        int j = 100;
        do {
            j *= 2;
            System.out.println(j);
        } while (j < 1000);

    }
}
