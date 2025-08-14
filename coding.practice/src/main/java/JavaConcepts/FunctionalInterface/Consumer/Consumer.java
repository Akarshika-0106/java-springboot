package JavaConcepts.FunctionalInterface.Consumer;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
