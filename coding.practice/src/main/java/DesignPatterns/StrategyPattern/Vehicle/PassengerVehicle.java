package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
