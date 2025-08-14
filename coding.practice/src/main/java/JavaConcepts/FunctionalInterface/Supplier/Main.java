package JavaConcepts.FunctionalInterface.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "This is the data I am returning";
        System.out.println(supplier.get());
    }
}
