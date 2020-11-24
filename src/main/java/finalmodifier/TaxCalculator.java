package finalmodifier;

public class TaxCalculator {

    public static final double TAXPERCENT = 27;

    public double tax(double price){
        return price * (TAXPERCENT / 100);
    }

    public double priceWithTax(double price) {
        return price * (1 + TAXPERCENT / 100);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(100_000));
        System.out.println(taxCalculator.priceWithTax(100_000));
    }
}