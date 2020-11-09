package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Peter", 2005, 4_500_000);

        employee.setName("Hendrik Peti");
        System.out.println(employee);

        employee.raiseSalary(250_000);

        System.out.println(employee);
    }
}
