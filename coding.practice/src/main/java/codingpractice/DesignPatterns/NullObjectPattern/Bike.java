package codingpractice.DesignPatterns.NullObjectPattern;

public class Bike implements Vehicle{
    @Override
    public int getSeatCapacity() {
        return 2;
    }

    @Override
    public int getTankCapacity() {
        return 20;
    }
}
