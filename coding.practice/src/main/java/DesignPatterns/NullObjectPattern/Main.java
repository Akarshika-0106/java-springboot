package DesignPatterns.NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle1);

        Vehicle vehicle2 = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle2 );

        Vehicle vehicle3 = VehicleFactory.getVehicleObject("Truck");
        printVehicleDetails(vehicle3);

    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Vehicle seat capacity: "+vehicle.getSeatCapacity());
        System.out.println("Vehicle tanl capacity: "+vehicle.getTankCapacity());
    }
}
