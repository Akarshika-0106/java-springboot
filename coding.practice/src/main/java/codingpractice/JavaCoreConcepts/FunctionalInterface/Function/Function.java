package codingpractice.JavaCoreConcepts.FunctionalInterface.Function;

@FunctionalInterface
public interface Function<T,R>{

    R apply(T t);
}
