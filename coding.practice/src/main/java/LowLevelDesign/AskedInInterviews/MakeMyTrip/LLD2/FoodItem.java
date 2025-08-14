package LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD2;

public class FoodItem {
    private String itemName;
    private int price;
    private String restaurantName;

    public FoodItem(String itemName, int price, String restaurantName) {
        this.itemName = itemName;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }
}
