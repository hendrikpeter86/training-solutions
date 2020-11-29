package operators;

public class OperatorsMain {
    public static void main(String[] args) {

        System.out.println(0333);

        System.out.println(new Operators().isEven(5));
        System.out.println(new Operators().isEven(6));

        System.out.println(new Operators().multiplyByPowerOfTwo(12,2));
        System.out.println(new Operators().multiplyByPowerOfTwo(15,5));





        /*        System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(9 << 1)); //teljesen felesleges, sosem fogod használni
        System.out.println(Integer.toBinaryString(9 >> 1));

       System.out.println(true || (1/0 == 0));*/


    }
}
