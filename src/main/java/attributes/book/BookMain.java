package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("A könyv címe");

        System.out.println(book1.getTitle());

        book1.setTitle("A könyv új címe setterrel beállítva");

        System.out.println(book1.getTitle());


    }
}


