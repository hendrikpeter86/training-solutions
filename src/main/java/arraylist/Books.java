package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }

    public void findAllByPrefix(String prefix) {
        List<String> filteredTitles = new ArrayList<>();

        for (String title : titles) {
            if (title.indexOf(prefix) == 0) {
                filteredTitles.add(title);
            }
        }
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Java alapok");
        books.add("Java haladó");
        books.add("Python haladó");

        System.out.println(books.getTitles());

//        List<String> titlesStartsWithJava = books.findAllByPrefix("Java");

//        System.out.println(titlesStartsWithJava);
    }
}
