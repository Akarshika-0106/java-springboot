package machine.coding.practice.java.OOPS.SOLIDPrinciples.LiskovSubstitutionPrinciple.Solution;

public class EngineVehicle extends Vehicle {
    public EngineVehicle(String name){
        super(name);
    }
    public boolean hasEngine(){
        return true;
    }
}
