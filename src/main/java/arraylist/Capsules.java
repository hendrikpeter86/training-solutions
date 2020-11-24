package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colors = new ArrayList<>();

    public void addLast(String color) {
        colors.add(color);
    }

    public void addFirst(String color) {
        colors.add(0, color);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();

        capsules.addFirst("zöld");
        capsules.addFirst("fehér");
        capsules.addFirst("piros");

        System.out.println(capsules.getColors());

        capsules.addLast("fekete");

        System.out.println(capsules.getColors());

        capsules.removeLast();

        System.out.println(capsules.getColors());

        capsules.removeFirst();

        System.out.println(capsules.getColors());

    }
}
