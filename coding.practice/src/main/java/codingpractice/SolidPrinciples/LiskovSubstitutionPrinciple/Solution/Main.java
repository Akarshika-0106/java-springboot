package codingpractice.SolidPrinciples.LiskovSubstitutionPrinciple.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EngineVehicle> engineVehicleList = new ArrayList<>();
        engineVehicleList.add(new Car("Car"));
        engineVehicleList.add(new Motorcycle("Motorcycle"));

        for(EngineVehicle v : engineVehicleList){
            System.out.println(v.getName() +" has engine: "+v.hasEngine());
            System.out.println(v.getName() + " has "+ v.startVehicle());
        }
        
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bicycle("Bicycle"));

        for (Vehicle v : vehicleList){
            System.out.println(v.getName() + " has "+v.startVehicle());
        }
    }
}
