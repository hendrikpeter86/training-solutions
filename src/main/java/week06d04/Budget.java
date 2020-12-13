package week06d04;


import java.util.Arrays;
import java.util.List;

public class Budget {

    public Budget(List<Item> items) {
    }

    public static void main(String[] args) {

    Item item = new Item(10, 5, "fogkefe");
    List<Item> list = Arrays.asList(item);
        Budget budget = new Budget(list);
    }


}
