package machine.coding.practice.java.JavaConcepts.DefaultStaticPrivate;

public interface Bird extends LivingThing{


    public void canFly();
    boolean canBreath(); //this method is now abstracted

    default int getMinimumFlyHeight(){
        return 100;
    }
}
