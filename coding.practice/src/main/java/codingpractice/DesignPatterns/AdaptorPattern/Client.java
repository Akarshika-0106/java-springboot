package codingpractice.DesignPatterns.AdaptorPattern;

import codingpractice.DesignPatterns.AdaptorPattern.Adaptee.WeighingMachineForBabies;
import codingpractice.DesignPatterns.AdaptorPattern.Adapter.WeighingMachineAdapter;
import codingpractice.DesignPatterns.AdaptorPattern.Adapter.WeighingMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineForBabies());
        System.out.println(weighingMachineAdapter.getWeightInKg());

    }
}
