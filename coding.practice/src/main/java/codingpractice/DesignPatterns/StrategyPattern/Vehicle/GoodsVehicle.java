package codingpractice.DesignPatterns.StrategyPattern.Vehicle;

import codingpractice.DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
