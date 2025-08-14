package machine.coding.practice.java.OOPS.DesignPatterns.NullObjectPattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicleType){
        if("Car".equals(vehicleType)){
            return new Car();
        }else if("Bike".equals(vehicleType)){
            return new Bike();
        }else{
            return new NullVehicle();
        }
    }
}
