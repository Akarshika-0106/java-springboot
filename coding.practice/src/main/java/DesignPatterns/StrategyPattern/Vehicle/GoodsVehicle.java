package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
