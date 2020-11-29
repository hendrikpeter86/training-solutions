package circle;

public class Circle {
    private int  diameter;
    public final double PI = 3.14d;

    public Circle(int diameter) {
        this.diameter = diameter;
    }


    public double perimeter(){
        return diameter * PI;
    }

    public double area(){
        return (double) (diameter / 2d) * (diameter / 2d) * PI;
    }



}
