package DesignPatterns.BuilderPattern;

import java.util.List;

public class Student {
    private int roleNumber;
    private String name;
    private int age;
    private String fatherName;
    private String motherName;
    private List<String> subjects;
    private String mobileNumber;

    public Student(StudentBuilder studentBuilder){
        this.roleNumber = studentBuilder.roleNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.name;
        this.mobileNumber = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
        this.mobileNumber = studentBuilder.mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roleNumber=" + roleNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
