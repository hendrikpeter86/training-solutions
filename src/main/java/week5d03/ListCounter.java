package week5d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("alma");
        list.add("traktor");
        list.add("makréla");
        list.add("Anna");
        list.add("alapos");
        list.add("Terike");

        if(list.get(0).equals("a") || list.get(0).equals("A")){
            for(String listPart : list){
                System.out.println(listPart);
            }
        }else{
            System.out.println(0);
        }

    }
}
