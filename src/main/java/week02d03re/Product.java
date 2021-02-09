package week02d03re;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }


    public static void main(String[] args) {

        Product product1 = new Product("Samsung", "123");
        Product product2 = new Product("Samsung", "123");

        System.out.println(product1.name + ", " + product1.code);
        System.out.println(product2.name + ", " + product2.code);


    }


}
