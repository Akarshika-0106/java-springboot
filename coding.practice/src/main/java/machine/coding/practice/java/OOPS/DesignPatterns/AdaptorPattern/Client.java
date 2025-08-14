package machine.coding.practice.java.OOPS.DesignPatterns.AdaptorPattern;

import machine.coding.practice.java.OOPS.DesignPatterns.AdaptorPattern.Adaptee.WeighingMachineForBabies;
import machine.coding.practice.java.OOPS.DesignPatterns.AdaptorPattern.Adapter.WeighingMachineAdapter;
import machine.coding.practice.java.OOPS.DesignPatterns.AdaptorPattern.Adapter.WeighingMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineForBabies());
        System.out.println(weighingMachineAdapter.getWeightInKg());

    }
}
