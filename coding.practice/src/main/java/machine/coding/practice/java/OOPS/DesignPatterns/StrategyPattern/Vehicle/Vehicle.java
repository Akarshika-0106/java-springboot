package machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle;

import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
