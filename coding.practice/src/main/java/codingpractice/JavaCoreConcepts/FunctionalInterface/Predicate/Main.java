package codingpractice.JavaCoreConcepts.FunctionalInterface.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer val) -> {
            if(val%2 == 0){
                return  true;
            }else{
                return false;
            }
        };

        System.out.println(isEven.test(101));
        System.out.println(isEven.test(80));
    }
}
