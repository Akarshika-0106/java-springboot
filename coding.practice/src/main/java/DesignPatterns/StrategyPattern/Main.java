package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Vehicle.GoodsVehicle;
import DesignPatterns.StrategyPattern.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
