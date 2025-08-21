package codingpractice.DesignPatterns.StrategyPattern.Vehicle;

import codingpractice.DesignPatterns.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
