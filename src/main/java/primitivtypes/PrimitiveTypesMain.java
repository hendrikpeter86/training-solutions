package primitivtypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        PrimitiveTypes primitiveTypes = new PrimitiveTypes();

        System.out.println(primitiveTypes.toBinaryString(5));

        String ellenorzes = Integer.toBinaryString(5);

        System.out.println(ellenorzes);
      //  System.out.println(Integer.toBinaryString(5));






      /*

        int i = 9;

        //Integer j = new Integer(9);  //teljesen felesleges java 5-től az autoboxing segítségével
        Integer j = 9; //így a jó

        List<Integer> numbers = new ArrayList<>();  //Listbe int-et nem írhatok
        numbers.add(j);  //i vagy j is adható paraméternek

        System.out.println(Integer.toString(9, 2)); //2-es számrendszerben kiírni a 9-et, ami 1001
        System.out.println(Integer.toString(-9, 2));  //itt csak elé teszi a - jelet, de a 9-es számot írja ki
        System.out.println(Integer.toBinaryString(-9));  //2-es számrendszerben kiírni a -9-et, ami a 11111111111111111111111111110111

        int k = Integer.parseInt("9"); //szövegből számot konvertálunk, de fontos, hogy szám legyen, mert különben hiba jön vissza

        */


    }



}
