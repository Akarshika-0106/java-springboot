package machine.coding.practice.LLD.AskedInInterviews.MakeMyTrip.LLD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestaurantBAdapter implements RestaurantAdapter{
    RestaurantB restaurantB = new RestaurantB();

    @Override
    public List<FoodItem> getMenu() {
        Map<String, Integer> menuBList = restaurantB.getMenuB();
        List<FoodItem> menu = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: menuBList.entrySet()){
            menu.add(new FoodItem(entry.getKey(), entry.getValue(), "Restaurant B"));
        }
        return menu;
    }
}
