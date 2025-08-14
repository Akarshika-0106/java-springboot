package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
