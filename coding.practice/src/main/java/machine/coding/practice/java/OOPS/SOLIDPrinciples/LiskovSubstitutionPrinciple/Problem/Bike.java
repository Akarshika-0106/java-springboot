package machine.coding.practice.java.OOPS.SOLIDPrinciples.LiskovSubstitutionPrinciple.Problem;

public class Bike extends Vehicle {

    private int speed;
    private boolean isEngineOn;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;

    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
