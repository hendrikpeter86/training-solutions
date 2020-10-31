package AtiBit;

public class aritmetikai_operatorok {
    public static void main(String[] args) {

        //aritmetikai operátorok (+ - *
        // ++ inkrement, növeli eggyel
        // -- dikrement, csökkenti eggyel/
        // % moduló: maradékososztás, 7-ben az 5 megvan egyszer, maradék, tehát az eredmény: 2  )

        int szam1 = 7;
        int szam2 = 5;
        int szam3 = szam1 % szam2;

        System.out.println(szam3);

        szam3++; //ugyanaz: szam3 += 1;  <- de itt akár nagyobb számmal is növelhetem, ugyanaz szam3 = szam3 + 1;


        int szam4 = 6 + 5 * 2; //valós matematikai sorrendben végzi el a műveleteket, elsősorban szorzás, majd összeadás

        System.out.println(szam4);

    }



}



