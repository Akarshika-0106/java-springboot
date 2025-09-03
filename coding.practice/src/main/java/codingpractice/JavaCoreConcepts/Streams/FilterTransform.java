package codingpractice.JavaCoreConcepts.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilterTransform {
    public static void main(String[] args) {
        List<String> input = List.of("Java Streams", "Streams in Java", "Interview Questions");
        List<String> result = input.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(result);
    }
}
