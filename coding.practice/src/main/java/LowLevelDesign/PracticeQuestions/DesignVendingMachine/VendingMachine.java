package LowLevelDesign.PracticeQuestions.DesignVendingMachine;

import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Inventory;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Money;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingState.IdleState;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public Inventory inventory;
    public State vendingMachineState;
    public List<Money> moneyList;

    public VendingMachine(){
        inventory = new Inventory(10);
        vendingMachineState = new IdleState() ;
        moneyList = new ArrayList<>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public void setMoneyList(List<Money> moneyList) {
        this.moneyList = moneyList;
    }
}
