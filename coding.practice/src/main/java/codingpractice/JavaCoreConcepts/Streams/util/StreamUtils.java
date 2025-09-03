package codingpractice.JavaCoreConcepts.Streams.util;

import java.util.stream.IntStream;

public class StreamUtils {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch( i -> n%i != 0);
    }
}
