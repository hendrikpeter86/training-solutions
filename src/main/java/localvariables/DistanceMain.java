package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(103.5, true);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int i = (int) distance.getDistanceInKm();

        System.out.println(i);

    }
}
