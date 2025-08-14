package machine.coding.practice.java.OOPS.DesignPatterns.NullObjectPattern;

public class NullVehicle implements Vehicle{
    @Override
    public int getSeatCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
