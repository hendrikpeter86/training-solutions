package aAndKAkademia;

public class While {
    public static void main(String[] args) {
        System.out.println("Hello");

        int i = 10;
        while (i < 13){  //kerekzárójelben boolean kell lenni, előletesztelő ciklus, tehát előbb olyan, mint az if
            System.out.println(i);
            i++;
        }
        System.out.println("Viszlát");


        int j = 345_643_566;

        while (j > 0){
            System.out.println(j);
            j /= 10;
        }


    }

}
