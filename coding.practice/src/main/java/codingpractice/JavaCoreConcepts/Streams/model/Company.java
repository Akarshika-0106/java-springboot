package codingpractice.JavaCoreConcepts.Streams.model;

import java.util.List;

public class Company {
    private List<Department> departments;
    public Company(List<Department> departments) { this.departments = departments; }
    public List<Department> getDepartments() { return departments; }
}
