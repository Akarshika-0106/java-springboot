package codingpractice.JavaCoreConcepts.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyMap {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,2,2,3,3,3,3,5,5,8,8,8,8,8,8);
        Map<Integer, Integer> map = integers.stream()
                .collect(Collectors.toMap(n -> n, n -> 1, Integer::sum));
        System.out.println("Frequency map: "+ map);
    }
}


//Collectors.toMap(
//        n -> n,           // keyMapper
//        n -> 1,           // valueMapper
//        Integer::sum      // mergeFunction
//)