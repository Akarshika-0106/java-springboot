package machine.coding.practice.java.OOPS.SOLIDPrinciples.LiskovSubstitutionPrinciple.Solution;

public class Vehicle {
    //Solution is put generic methods in parent class
    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public String startVehicle(){
        return "started";
    }

    public String getName(){
        return this.name;
    }
}
