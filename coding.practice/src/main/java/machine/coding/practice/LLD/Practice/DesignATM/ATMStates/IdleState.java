package machine.coding.practice.LLD.Practice.DesignATM.ATMStates;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;
import machine.coding.practice.LLD.Practice.DesignATM.Card;

public class IdleState extends ATMState{


    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
