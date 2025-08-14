package machine.coding.practice.LLD.Practice.DesignVendingMachine.VendingState;

import machine.coding.practice.LLD.Practice.DesignVendingMachine.Model.Item;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.Model.Money;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.VendingMachine;

import java.util.List;

public class ProductSelectionState implements State{

    public ProductSelectionState() {
        System.out.println("Vending machine is in Product Selection state");
    }

    @Override
    public void clickOnInsertMoneyButton(VendingMachine machine) throws Exception{
        return;
    }

    @Override
    public void insertMoney(VendingMachine machine, Money money) throws Exception{
        return;
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception{
        return;
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        Item item = machine.getInventory().getItem(code);
        System.out.println("Item selected by customer is "+ item.getItemType().name() +" which has item code = "+code);
        int userPaid = 0;
        for(Money money : machine.getMoneyList()){
            userPaid += money.value;
        }

        if(userPaid < item.price){
            System.out.println("Insufficient amount paid. Please collect the refunded amount from tray");
            cancelAndRefund(machine);
        }else {
            if (userPaid > item.price){
                System.out.println("Please collect the change from tray");
                getChange(userPaid - item.price);
            }
           machine.setVendingMachineState(new DispenseItemState(machine, code));
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("Product can not be dispensed in the product selection state");

    }

    @Override
    public List<Money> cancelAndRefund(VendingMachine machine) throws Exception{
        machine.setVendingMachineState(new IdleState());
        return machine.getMoneyList();
    }

    @Override
    public int getChange(int changeAmount) throws Exception{
        return changeAmount;
    }
}
