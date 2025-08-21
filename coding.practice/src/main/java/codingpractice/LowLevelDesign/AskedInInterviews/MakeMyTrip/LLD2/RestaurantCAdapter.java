package codingpractice.LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD2;

import java.util.ArrayList;
import java.util.List;

public class RestaurantCAdapter implements RestaurantAdapter{
    RestaurantC restaurantC = new RestaurantC();

    @Override
    public List<FoodItem> getMenu() {
        List<RestaurantC.Item> menuCList = restaurantC.getMenuC();
        List<FoodItem> menu = new ArrayList<>();
        for(RestaurantC.Item item: menuCList){
            menu.add(new FoodItem(item.name, item.price, "Restaurant C"));
        }
        return menu;
    }
}
