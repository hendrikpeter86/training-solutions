package week05d04;

import java.time.LocalDate;

public class Product {

    String termekNev;
    LocalDate lejaratiIdo;

    public Product(LocalDate lejaratiIdo) {
        this.lejaratiIdo = lejaratiIdo;
    }

    public Product(String termekNev) {
        this.termekNev = termekNev;
    }





    public Product(String name, int year, int month, int day){

    }
}
