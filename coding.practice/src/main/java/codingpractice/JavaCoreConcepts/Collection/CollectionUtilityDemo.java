package codingpractice.JavaCoreConcepts.Collection;

import java.util.*;

public class CollectionUtilityDemo {

    public static void main(String[] args) {
        List<String> fictionalNames = Arrays.asList("Sheldon", "Amy", "Rajesh", "Leonard", "Penny",
                "Haword", "Bernadette", "Rachael", "Mindy", "Danny", "Jared", "Richard", "Gilfoyle",
                "Gavin", "Erlich", "Jin Yang", "Dinesh", "Alexis", "David", "Moira", "Johnny");

        //Sorting alphabetically ( by default)
//        Collections.sort(fictionalNames);
//        fictionalNames.forEach(System.out::println);

        //Custom sorting by length of name
       // Collections.sort(fictionalNames, Comparator.comparingInt(String::length));
        //fictionalNames.forEach(System.out::println);


        //Sorting in descending order
        //fictionalNames.sort(Collections.reverseOrder());
        //fictionalNames.forEach(System.out::println);


        //Binary Search
//        Collections.sort(fictionalNames);
//        fictionalNames.forEach(System.out::println);
//        int index = Collections.binarySearch(fictionalNames, "Bernadette");
//        System.out.println(index);



        //Revering the list
//        Collections.reverse(fictionalNames);
//        fictionalNames.forEach(System.out::println);



        //Shuffling the list
//        Collections.shuffle(fictionalNames);
//        fictionalNames.forEach(System.out::println);



        //Swapping elements
//        Collections.swap(fictionalNames, 0, fictionalNames.size()-1);
//        fictionalNames.forEach(System.out::println);


        //Creating an unmodifiable collection
//        List<String> unmodifiableList = Collections.unmodifiableList(fictionalNames);
//        unmodifiableList.set(0, "Jocelyn");

        //Finding min and max by custom comparator (e.g. longest and shortest names)
//        String shortestName = Collections.min(fictionalNames, Comparator.comparingInt(String::length));
//        System.out.println("Minimum length: "+shortestName);
//        String longestName = Collections.max(fictionalNames, Comparator.comparingInt(String::length));
//        System.out.println("Maximum length: "+longestName);

        //Frequency of an element
//        int frequency = Collections.frequency(fictionalNames, "Amy");
//        System.out.println(frequency);

        //Disjoints: check if two elements have no elements in common
//        List<String> newList =  Arrays.asList("Gwen", "Stevy", "Ronald");
//        boolean noCommonElements = Collections.disjoint(fictionalNames, newList);
//        System.out.println(noCommonElements); // returns true if there is no common element

        //Copying the content from one list to another
//        List<String> copyList = new ArrayList<>(Collections.nCopies(fictionalNames.size(), ""));
//        Collections.copy(copyList, fictionalNames);
//        copyList.forEach(System.out::println);

        //Replacing all the elements with single value
//        Collections.fill(fictionalNames, "new value");
//        fictionalNames.forEach(System.out::println);

        //Synchronised Collection
        Collection<String> synchronisedCollection = Collections.synchronizedCollection(new ArrayList<>(fictionalNames));
        synchronisedCollection.forEach(System.out::println);



    }
}
