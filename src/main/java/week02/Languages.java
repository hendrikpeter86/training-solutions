package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> langNames = new ArrayList<>();

        langNames.add("Java");
        langNames.add("Python");
        langNames.add("JavaScript");

        for (String languages : langNames) {
            if (languages.length() > 5) {
                System.out.println(languages);
            }
        }

    }



}
