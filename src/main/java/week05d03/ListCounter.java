package week05d03;

/*
import java.util.ArrayList;
*/
import java.util.List;

public class ListCounter {

    public int counter(List<String> list){
        int sumOfWords = 0;
        for(String each : list){
            String firstChar = each.substring(0,1);
            if(firstChar.toLowerCase().equals("a")){
                sumOfWords++;
            }
        }
        return sumOfWords;
    }



   /* public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("alma");
        list.add("traktor");
        list.add("makréla");
        list.add("Anna");
        list.add("alapos");
        list.add("Terike");

        for(String listPart : list){
    //        if(listPart.charAt(0) == "a"){}
        }

        if(list.get(0).equals("a") || list.get(0).equals("A")){

        }else{
            System.out.println(0);
        }

    } */
}
