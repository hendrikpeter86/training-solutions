package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("one");
        l.add("two");
        l.add("three");

        String s = l.toString();
        System.out.println(s);

        System.out.println(l);  //meghívja a system.out.println a .toString metódust a háttérben

        System.out.println(l.get(1)); //indexet kéri, 0-tól indul

        l.add("four"); //hozzáadja a listához

        l.remove(0); //törli a 0. indexen lévőt
        System.out.println(l);

        System.out.println(l.size()); //megadja a lista méretét

        System.out.println(l.contains("one"));  //tartalmazza-e?
        System.out.println(l.contains("two"));

        System.out.println(l.indexOf("two"));  //megadja a listában melyik indexen van

        l.clear();  //kiüríti a listát
        System.out.println(l);


        List<Integer> i = Arrays.asList(1, 2, 3); //változó paraméter számú (bármennyivel működik)
        //int értékből lesz Integer objektum

        for (int j = 0; j < i.size(); j++) { //bejárhatjuk a lista elemeit for ciklussal
            System.out.println(i.get(j));
        }

        for (int j: i) {            //itt megint autoboxin van Integerből int
            System.out.println(j);
        }

    }
}
