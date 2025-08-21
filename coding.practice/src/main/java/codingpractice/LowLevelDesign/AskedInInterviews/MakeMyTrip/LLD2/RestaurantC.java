package codingpractice.LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD2;

import java.util.List;

public class RestaurantC {
    public static class Item {
        String name;
        int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public List<Item> getMenuC(){
        return List.of(new Item("Burger", 60),
                new Item("Pizza", 180),
                new Item("Pasta", 120));
    }

}
