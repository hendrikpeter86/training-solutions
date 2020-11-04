package array;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        int[] a1 = {3, 2, 1};
        int[] a2 = {3, 2, 1};

        int[][] b1 = {{1}, {2, 3}, {1, 2, 3}};
        int[][] b2 = {{1}, {2, 3}, {1, 2, 3}};

        System.out.println(Arrays.toString(a1)); //kiíratja a tömb elemeit
        System.out.println(Arrays.deepToString(b1));

        System.out.println(Arrays.equals(a1,a2)); //összehasonlítja, hogy egyeznek-e
        System.out.println(Arrays.deepEquals(b1,b2));

        Arrays.sort(a1);  //sorba rendezi az elemeket
        System.out.println(Arrays.toString(a1));

        System.out.println(Arrays.toString(Arrays.copyOfRange(a1,1,3)));  //résztömbök visszaadása

    }
}
