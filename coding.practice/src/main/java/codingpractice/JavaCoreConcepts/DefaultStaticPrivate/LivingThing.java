package codingpractice.JavaCoreConcepts.DefaultStaticPrivate;

public interface LivingThing {

    default boolean canBreath(){
        return true;
    }
}
