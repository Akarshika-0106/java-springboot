package machine.coding.practice.LLD.Practice.DesignATM.ATMStates;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;
import machine.coding.practice.LLD.Practice.DesignATM.Card;

public class CheckBalanceState extends ATMState{
    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your balance is: "+card.getBankAccount().getBalance());
    }
}
