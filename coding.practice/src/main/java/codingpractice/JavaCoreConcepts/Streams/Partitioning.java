package codingpractice.JavaCoreConcepts.Streams;

import codingpractice.JavaCoreConcepts.Streams.util.StreamUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> primeNonPrime = numbers.stream()
                .collect(Collectors.partitioningBy(StreamUtils::isPrime));
        System.out.println("Primes and Non-Primes: " + primeNonPrime);
    }
}
