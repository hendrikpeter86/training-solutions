package interfaces;

public class Courses implements HasName {

    private String name;

    @Override
    public String getName() {
        return name;
    }
}
