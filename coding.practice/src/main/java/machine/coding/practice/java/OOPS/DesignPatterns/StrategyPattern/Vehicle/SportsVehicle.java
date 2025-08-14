package machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle;

import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
