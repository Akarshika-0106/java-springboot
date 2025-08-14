package LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD2;

import java.util.ArrayList;
import java.util.List;

public class RestaurantAAdapter implements RestaurantAdapter{
    RestaurantA restaurantA = new RestaurantA();

    @Override
    public List<FoodItem> getMenu() {
        List<String> menuAList = restaurantA.getMenuA();
        List<FoodItem> menu = new ArrayList<>();
        for(String menuA: menuAList){
            String[] part = menuA.split(":");
            menu.add(new FoodItem(part[0], Integer.parseInt(part[1]), "Restaurant A"));
        }
        return menu;
    }
}
