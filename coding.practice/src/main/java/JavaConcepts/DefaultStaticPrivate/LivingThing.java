package JavaConcepts.DefaultStaticPrivate;

public interface LivingThing {

    default boolean canBreath(){
        return true;
    }
}
