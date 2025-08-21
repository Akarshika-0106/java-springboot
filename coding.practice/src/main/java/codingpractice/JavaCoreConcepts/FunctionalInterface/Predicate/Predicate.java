package codingpractice.JavaCoreConcepts.FunctionalInterface.Predicate;

@FunctionalInterface
public interface Predicate<T>{
    boolean test(T t);
}
