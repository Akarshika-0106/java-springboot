package machine.coding.practice.java.JavaConcepts.DefaultStaticPrivate;

public interface LivingThing {

    default boolean canBreath(){
        return true;
    }
}
