package codingpractice.JavaCoreConcepts.Streams;

import codingpractice.JavaCoreConcepts.Streams.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jim", "Sales", 5000),
                new Employee("Dwight", "Sales", 4500),
                new Employee("Pam", "IT", 3000),
                new Employee("Angela", "Finance", 5000),
                new Employee("Oscar", "Finance", 4800)
        );

        Map<String, List<Employee>> groupByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Group by department: " + groupByDepartment);

        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salary by department: " + avgSalary);

    }
}
