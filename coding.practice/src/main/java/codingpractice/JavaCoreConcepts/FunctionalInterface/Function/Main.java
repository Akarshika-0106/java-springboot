package codingpractice.JavaCoreConcepts.FunctionalInterface.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> integerToString = (Integer val) -> {
            String output = val.toString();
            return output;
        };

        System.out.println(integerToString.apply(64));
    }
}
