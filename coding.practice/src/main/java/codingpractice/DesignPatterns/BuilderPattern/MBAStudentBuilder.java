package codingpractice.DesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Finance");
        subjects.add("Economics");
        subjects.add("Marketing");
        this.subjects = subjects;
        return this;
    }
}
