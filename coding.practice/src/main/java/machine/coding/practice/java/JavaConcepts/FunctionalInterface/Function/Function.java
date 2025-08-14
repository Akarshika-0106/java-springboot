package machine.coding.practice.java.JavaConcepts.FunctionalInterface.Function;

@FunctionalInterface
public interface Function<T,R>{

    R apply(T t);
}
