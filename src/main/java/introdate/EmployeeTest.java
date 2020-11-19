package introdate;

public class EmployeeTest {



    public static void main(String[] args) {

        Employee employee = new Employee(1986, 05, 28, "Peter");
        System.out.println(employee.getName());
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
