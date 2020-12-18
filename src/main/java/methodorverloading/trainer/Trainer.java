package methodorverloading.trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int age;

    private List<Course> courses = new ArrayList<>();


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
