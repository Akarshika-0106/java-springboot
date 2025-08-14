package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
