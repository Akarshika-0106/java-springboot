package machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern;

import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle.GoodsVehicle;
import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
