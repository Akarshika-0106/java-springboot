package codingpractice.DesignPatterns.StrategyPattern;

import codingpractice.DesignPatterns.StrategyPattern.Vehicle.GoodsVehicle;
import codingpractice.DesignPatterns.StrategyPattern.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
