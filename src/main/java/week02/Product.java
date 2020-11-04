package week02;

public class Product {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

/*    public boolean areTheyEqual(Product p) {
        return p.name
    }*/

    public static void main(String[] args) {
        Product product1 = new Product("Samsung", "1");
        Product product2 = new Product("Nokia", "2");

        System.out.println(product1);}
}
