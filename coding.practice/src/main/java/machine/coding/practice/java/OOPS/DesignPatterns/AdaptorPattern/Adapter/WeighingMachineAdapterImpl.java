package machine.coding.practice.java.OOPS.DesignPatterns.AdaptorPattern.Adapter;

import machine.coding.practice.java.OOPS.DesignPatterns.AdaptorPattern.Adaptee.WeighingMachine;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter {
     WeighingMachine weighingMachine;

    public WeighingMachineAdapterImpl(WeighingMachine weighingMachine){
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weighingMachine.getWeightInPound();
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
