package classsctructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store1 = new Store("laptop");
        store1.store(12);
        System.out.println(store1.getProduct() + ": " + store1.getStock());

        Store store2 = new Store("mobil");
        store2.store(20);
        System.out.println(store2.getProduct() + ": " + store2.getStock());


        store1.dispatch(7);
        store1.store(3);
        store2.dispatch(5);
        store2.store(4);

        System.out.println(store1.getProduct() + ": " + store1.getStock());
        System.out.println(store2.getProduct() + ": " + store2.getStock());
    }
}
