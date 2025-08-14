package JavaConcepts.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Collections vs Collection
        //Collections is a utility class which provides static methods like sort, swap, max, min, reverse etc.
        //Collection is an interface which is part of Java Collection framework which expose various methods
        // which are implemented by various collection classes like ArrayList, Stack, LinkedList etc.

        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.add(3);
        values.add(1);
        values.add(2);

        System.out.println("Original values: ");
        System.out.println(values);
        Collections.sort(values);
        System.out.println("After sorting");
        System.out.println(values);
        System.out.println("Max value is "+Collections.max(values));
        System.out.println("Min value is "+Collections.min(values));


    }
}
