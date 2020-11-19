package array;

public class ArrayMain {


    public static void main(String[] args) {
/*        int[] a = {1, 2, 3};

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        for (int item: a) {
            System.out.println(item);
        }*/

        String[] week = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(week[1]);

        System.out.println(week.length);

        int[] two = new int[5];
        two[0] = 1;

        for (int i = 1; i < two.length; i++) {

            two[i] = two[i - 1] * 2;
        }

        for (int i = 0; i < two.length; i++) {

            System.out.println(two[i] + " ");
        }

        boolean[] bools = new boolean[6];

        for (int i = 1; i < bools.length; i++) {
            bools[i] = !bools[i - 1];
        }

        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i] + " ");
        }
    }

}
