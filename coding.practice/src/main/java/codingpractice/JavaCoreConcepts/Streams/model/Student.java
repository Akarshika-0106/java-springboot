package codingpractice.JavaCoreConcepts.Streams.model;

public class Student {
    private String name;
    private String grade;
    private int score;

    public Student(String name, String grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getGrade() { return grade; }
    public int getScore() { return score; }

    @Override
    public String toString() {
        return name + "(" + grade + ", " + score + ")";
    }
}
