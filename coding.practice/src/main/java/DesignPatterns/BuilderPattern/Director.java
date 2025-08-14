package DesignPatterns.BuilderPattern;

public class Director {

    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return  createEngineeringStudentBuilder();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return  createMBAStudentBuilder();
        }
        return null;
    }

    private Student createEngineeringStudentBuilder(){
        return studentBuilder
                .setAge(21)
                .setName("Richard")
                .setRoleNumber(123)
                .setFatherName("Jared")
                .setMotherName("Monica")
                .setMobileNumber("9937471999")
                .setSubjects()
                .build();
    }

    private Student createMBAStudentBuilder(){
        return studentBuilder
                .setAge(24)
                .setName("Gavin")
                .setRoleNumber(145)
                .setFatherName("Jin Yang")
                .setMotherName("Dinesh")
                .setMobileNumber("8837471997")
                .setSubjects()
                .build();
    }
}
