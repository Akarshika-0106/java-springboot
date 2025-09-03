package codingpractice.JavaCoreConcepts.Streams.model;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + "(" + department + ", " + salary + ")";
    }
}
