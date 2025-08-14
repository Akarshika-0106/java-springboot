package machine.coding.practice.java.OOPS.DesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Data Structures");
        subjects.add("Computer Networks");
        subjects.add("Operating Systems");
        this.subjects = subjects;
        return this;
    }
}
