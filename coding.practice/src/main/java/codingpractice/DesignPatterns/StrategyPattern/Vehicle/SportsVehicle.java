package codingpractice.DesignPatterns.StrategyPattern.Vehicle;

import codingpractice.DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
