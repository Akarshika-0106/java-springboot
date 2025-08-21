package codingpractice.DesignPatterns.StrategyPattern.Vehicle;

import codingpractice.DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
