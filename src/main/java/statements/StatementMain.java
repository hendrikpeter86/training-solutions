package statements;

public class StatementMain {

    public static void main(String[] args) {

       int i = 5 + 6;
        System.out.println(5+6);

        System.out.println("Hello" + i + "World");

        StatementMain s = new StatementMain();  //new StatementMain(); már ezzel kész a példány,
                                                // de hozzá kell rendelni egy lokális változóhoz,
        System.out.println(i = 8);              //jelen esetben az s-hez, aminek a típusa StatementMain

        System.out.println("".equals("aaa"));         // Stringek összehasonlítására .equals való
        System.out.println("aaa".equals("aaa"));

        System.out.println(!(i % 2 == 0) || true);   //! negáció

        i++;  // u.a.   i = i + 1;   vagy i += 1;

        System.out.println(i);

        System.out.println(i % 2 == 0 ? "páros" : "páratlan");   //ha igaz az elsőt értékeli ki, ha hamis a másodikat értékeli ki




        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;

     boolean b = x > y;
     boolean c = b || (z > 5);
        z++;


    }
}
