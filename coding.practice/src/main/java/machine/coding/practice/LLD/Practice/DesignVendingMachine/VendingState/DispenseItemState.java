package machine.coding.practice.LLD.Practice.DesignVendingMachine.VendingState;

import machine.coding.practice.LLD.Practice.DesignVendingMachine.Model.Item;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.Model.Money;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.VendingMachine;

import java.util.List;

public class DispenseItemState implements State{

    public DispenseItemState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Vending machine is in the dispense state");
        dispenseProduct(machine, codeNumber);
    }
    @Override
    public void clickOnInsertMoneyButton(VendingMachine machine) throws Exception{
        throw new Exception("Click On Insert Money Button can not happen in dispense state");
    }

    @Override
    public void insertMoney(VendingMachine machine, Money money) throws Exception{
        throw new Exception("Money can not be inserted in the dispense state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception{
        throw new Exception("Click On Select Product Button can not happen in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception{
        throw new Exception("Product can not be chosen in the dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState());
        return item;
    }

    @Override
    public List<Money> cancelAndRefund(VendingMachine machine) throws Exception{
        throw new Exception("Amount can not be refunded in the dispense state");
    }

    @Override
    public int getChange(int changeAmount) throws Exception{
        throw new Exception("Get change can not happen in the dispense state");
    }
}
