package codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model;

public class Item {

    public ItemType itemType;
    public int price;

    public Item(){
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
