package codingpractice.DesignPatterns.AdaptorPattern.Adaptee;

public class WeighingMachineForBabies implements WeighingMachine{
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
