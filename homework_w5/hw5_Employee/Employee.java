package hw5_Employee;

public class Employee {
    private String firstName, lastName;
    private int id, salary;

    public Employee() {

    }

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    public Employee raiseSalary (int percent) {
        salary = (int) (salary + percent/100.0 * salary);
        return this;
    }

    public String toString() {
        return String.format("Employee[id=%d, name=%s %s, salary=%d]", id, firstName, lastName, salary);
    }
}
