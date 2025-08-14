package DesignPatterns.BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {

    public int roleNumber;
    public String name;
    public int age;
    public String fatherName;
    public String motherName;
    public List<String> subjects;
    public String mobileNumber;


    public StudentBuilder setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract StudentBuilder setSubjects() ;


    public StudentBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
