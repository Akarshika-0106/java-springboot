package codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Item;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.ItemShelf;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.ItemType;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Money;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingState.State;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            fillUpInventory(vendingMachine);
            printInventory(vendingMachine);
            State vendingMachineState = vendingMachine.getVendingMachineState();
            System.out.println("Clicking on Insert money button");
            vendingMachineState.clickOnInsertMoneyButton(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.insertMoney(vendingMachine, Money.FIFTY);

            System.out.println("Clicking on select product button");
            vendingMachineState.clickOnSelectProductButton(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.chooseProduct(vendingMachine, 103);
            printInventory(vendingMachine);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelves = vendingMachine.getInventory().getItemShelves();
        for(int i=0; i<itemShelves.length; i++){
            Item newItem = new Item();
            if(i>=0 && i<3){
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(Money.FIFTY.value);
            } else if(i >= 3 && i < 5){
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(Money.TWENTY.value);
            }else if(i >= 5 && i < 7){
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(Money.FIVE.value);
            }else if(i>= 7 && i<10){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(Money.TEN.value);
            }
            itemShelves[i].setItem(newItem);
            itemShelves[i].setSoldOut(false);
        }
    }

    public static void printInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelves = vendingMachine.getInventory().getItemShelves();
        for(int i=0; i<itemShelves.length; i++){
            System.out.println("Item: " +itemShelves[i].getItem().getItemType().name()
                    + " Code: "+itemShelves[i].getCode()
            + " Price: "+itemShelves[i].getItem().getPrice()
            + " Is Available: "+!itemShelves[i].isSoldOut());
        }
    }

}
