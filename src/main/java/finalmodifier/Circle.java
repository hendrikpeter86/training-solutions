package finalmodifier;

public class Circle {

    public static final double PI = 3.14;  //nagybetűvel kell írni, mert "konstans", ha több SZÓ_AKKOR_ALÁHÚZÁS. static módosítószó jelentése, hogy osztályhoz tártozik és a final, többször nem lehet értéket adni neki

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }


}
