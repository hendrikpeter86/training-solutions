package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p){
        return name.equals(p.name);
    }

    public static void main(String[] args) {
        Product product1 = new Product("termek1", "111");
        Product product2 = new Product("termek1", "112");
        Product product3 = new Product("termek3", "113");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product1.areTheyEqual(product3));
    }
}
