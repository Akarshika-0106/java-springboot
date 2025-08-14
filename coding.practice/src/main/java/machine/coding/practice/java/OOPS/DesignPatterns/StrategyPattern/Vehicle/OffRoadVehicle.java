package machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle;

import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
