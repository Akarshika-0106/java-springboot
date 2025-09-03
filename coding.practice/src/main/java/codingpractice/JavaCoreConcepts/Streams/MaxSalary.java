package codingpractice.JavaCoreConcepts.Streams;

import codingpractice.JavaCoreConcepts.Streams.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jim", "Sales", 12000),
                new Employee("Angela", "Finance", 10000),
                new Employee("Oscar", "Sales", 10000),
                new Employee("Dwight", "Sales", 8000),
                new Employee("Pam", "Sales", 5000)
        );

        employees.stream().max(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(e -> System.out.println("High paid employee is: "+ e.getName()));
    }
}
