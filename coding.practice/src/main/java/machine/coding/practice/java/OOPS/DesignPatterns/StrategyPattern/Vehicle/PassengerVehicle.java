package machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Vehicle;

import machine.coding.practice.java.OOPS.DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
