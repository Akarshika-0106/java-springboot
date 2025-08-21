package codingpractice.LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuSearcher menuSearcher = new MenuSearcher();
        List<FoodItem> searchResult = menuSearcher.search("Burger");
        System.out.println("Search result for Burger:");
        for(FoodItem foodItem: searchResult){
            System.out.println(foodItem);
        }

    }
}
