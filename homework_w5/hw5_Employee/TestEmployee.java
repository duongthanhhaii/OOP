package hw5_Employee;

public class TestEmployee {
    public static void main (String[] args) {
        Employee employee = new Employee(8, "Peter", "Parker", 2500);
        System.out.println(employee);

        System.out.println(employee.raiseSalary(10));
    }
}
