package classsctructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Peter", "Java alapok");

        book.register("12");

        System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getRegNumber());
    }
}
