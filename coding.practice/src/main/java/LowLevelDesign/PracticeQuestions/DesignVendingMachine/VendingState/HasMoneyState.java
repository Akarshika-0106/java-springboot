package LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingState;

import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Item;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Money;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{
    public HasMoneyState(){
        System.out.println("Vending machine is in Has Money State");
    }

    @Override
    public void clickOnInsertMoneyButton(VendingMachine machine) throws Exception{
        return;
    }

    @Override
    public void insertMoney(VendingMachine machine, Money money) throws Exception{
        System.out.println("Money Inserted: "+ money.value);
        machine.getMoneyList().add(money);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception{
        machine.setVendingMachineState(new ProductSelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception{
        throw new Exception("Product selection can not happen in Has Money State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("Dispense Product can not happen in Has Money State");

    }

    @Override
    public List<Money> cancelAndRefund(VendingMachine machine) throws Exception{
        System.out.println("Amount is refunded and please collect it from the money tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getMoneyList();
    }

    @Override
    public int getChange(int changeAmount) throws Exception{
        throw new Exception("Get change can not happen in Has Money State");
    }
}
