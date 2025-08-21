package codingpractice.DesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Student engineeringStudent = director1.createStudent();
        System.out.println(engineeringStudent.toString());

        Director director2 = new Director(new MBAStudentBuilder());
        Student mbaStudent = director2.createStudent();
        System.out.println(mbaStudent.toString());
    }
}
