package codingpractice.JavaCoreConcepts.FunctionalInterface.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer val) -> {
            if(val > 10){
                System.out.println("logging");
            }
        };

        consumer.accept(11);
    }
}
