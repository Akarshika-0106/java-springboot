package DesignPatterns.AdaptorPattern;

import DesignPatterns.AdaptorPattern.Adaptee.WeighingMachineForBabies;
import DesignPatterns.AdaptorPattern.Adapter.WeighingMachineAdapter;
import DesignPatterns.AdaptorPattern.Adapter.WeighingMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineForBabies());
        System.out.println(weighingMachineAdapter.getWeightInKg());

    }
}
