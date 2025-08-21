package codingpractice.DesignPatterns.StrategyPattern.Vehicle;

import codingpractice.DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
