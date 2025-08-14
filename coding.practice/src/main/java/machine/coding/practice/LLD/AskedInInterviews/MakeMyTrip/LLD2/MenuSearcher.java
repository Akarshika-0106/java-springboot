package machine.coding.practice.LLD.AskedInInterviews.MakeMyTrip.LLD2;

import java.util.ArrayList;
import java.util.List;

public class MenuSearcher {
        private List<RestaurantAdapter> adapterList = List.of(
                new RestaurantAAdapter(),
                new RestaurantBAdapter(),
                new RestaurantCAdapter());

        public List<FoodItem> search(String keyword){
            List<FoodItem> result = new ArrayList<>();
            for(RestaurantAdapter adapter: adapterList){
                List<FoodItem> foodItemList = adapter.getMenu();
                for(FoodItem foodItem: foodItemList){
                    if (keyword.equalsIgnoreCase(foodItem.getItemName())){
                        result.add(foodItem);
                    }
                }
            }
            return result;
        }

}
