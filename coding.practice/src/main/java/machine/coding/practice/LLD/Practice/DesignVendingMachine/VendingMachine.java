package machine.coding.practice.LLD.Practice.DesignVendingMachine;

import machine.coding.practice.LLD.Practice.DesignVendingMachine.Model.Inventory;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.Model.Money;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.VendingState.IdleState;
import machine.coding.practice.LLD.Practice.DesignVendingMachine.VendingState.State;

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
