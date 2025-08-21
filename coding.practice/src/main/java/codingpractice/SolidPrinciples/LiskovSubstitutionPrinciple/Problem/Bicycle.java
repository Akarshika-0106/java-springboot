package codingpractice.SolidPrinciples.LiskovSubstitutionPrinciple.Problem;

public class Bicycle extends Vehicle {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
        //it will break the system
    }

    @Override
    public void accelerate() {

    }
}
