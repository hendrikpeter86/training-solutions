package training;

import java.util.List;

public class Employee {

    private final String name;

    private final int yearOfBirth;

    private final List<String> courses;

    public Employee(String name, int yearOfBirth, List<String> courses) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public List<String> getCourses() {
        return courses;
    }
}
