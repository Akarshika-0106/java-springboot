package LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model;

public class Inventory {

    public ItemShelf[] itemShelves;

    public Inventory(int size){
        itemShelves = new ItemShelf[size];
        initialiseInventory();
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    public void initialiseInventory(){
        int code = 101;
        for(int i=0; i<itemShelves.length; i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setSoldOut(true);
            itemShelf.setCode(code);
            itemShelves[i] = itemShelf;
            code++;
        }
    }

    public void addItem(Item item, int code) throws Exception{
        for(ItemShelf itemShelf:itemShelves){
            if(itemShelf.code == code){
                if(itemShelf.soldOut){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }else{
                    throw  new Exception("Item is already present, you can not add item here.");
                }
            }else{
                throw new Exception("Incorrect code");
            }
        }
    }

    public Item getItem(int code) throws Exception{
        for(ItemShelf itemShelf:itemShelves){
            if(itemShelf.code == code){
                if(!itemShelf.soldOut){
                    return itemShelf.item;
                }else {
                    throw new Exception("Item is sold out");
                }
            }
        }
        throw new Exception("Invalid code");
    }

    public void updateSoldOutItem(int code) throws Exception{
        for(ItemShelf itemShelf:itemShelves){
            if(itemShelf.code == code){
                itemShelf.setSoldOut(true);
            }
        }
    }
}
