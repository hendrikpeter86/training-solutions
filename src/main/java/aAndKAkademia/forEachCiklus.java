package aAndKAkademia;

public class forEachCiklus {

    public static void main(String[] args) {

        String[] names = {"Teszt Elek", "John Doe", "Jane Doe"};

        for (String name : names) {    //for (:){}    :-tól jobbra valamilyen tömb egyenlőre ,később tanulunk mást is
            System.out.println("Név: " + name);     //for each, tehát mindegyikre egyszer hajtja végre, végig megy a tömb összes elemén
        }



        String[] fruits = {"alma", "körte", "szilva"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        int[] winningLotteryNumbers = {43, 66, 10, 11, 42};
        for (int winningNubmer : winningLotteryNumbers) {
            System.out.println(winningNubmer);
        }

        boolean[] answers = { true, true, false};
        for (boolean answer : answers){
            System.out.println(answer);
        }

        for (int i = 0; i < answers.length; i++) {  //ez ugyanazt csinálja, mint az eggyel felette lévő for each ciklus
            System.out.println(answers[i]);
        }


    }

}

