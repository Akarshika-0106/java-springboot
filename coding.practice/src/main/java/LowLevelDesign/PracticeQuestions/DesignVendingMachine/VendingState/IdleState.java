package LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingState;

import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Item;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Money;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingMachine;

import java.util.List;

public class IdleState implements State{
    public IdleState() {
        System.out.println("Vending machine is in Idle State");
    }

    @Override
    public void clickOnInsertMoneyButton(VendingMachine machine) {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertMoney(VendingMachine machine, Money money) throws Exception{
        throw new Exception("Can not insert money in Idle State");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception{
        throw new Exception("Can not click on select product button in Idle State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception{
        throw new Exception("Can not select product in Idle State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("Can not dispense product in Idle State");
    }

    @Override
    public List<Money> cancelAndRefund(VendingMachine machine) throws Exception{
        throw new Exception("Can not cancel or refund in Idle State");
    }

    @Override
    public int getChange(int changeAmount) throws Exception{
        throw new Exception("Can not get change in Idle State");
    }
}
