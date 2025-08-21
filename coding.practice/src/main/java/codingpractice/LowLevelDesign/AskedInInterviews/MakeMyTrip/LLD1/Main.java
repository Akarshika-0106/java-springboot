package codingpractice.LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD1;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.communicate();

        engineer.setSkill(new CodingSkill());
        engineer.setSkill(new MakeRobotSkill());

        engineer.doWork();
    }
}
