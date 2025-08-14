package machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle;

import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
