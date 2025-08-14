package machine.coding.practice.LLD.Practice.DesignATM.ATMStates;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;
import machine.coding.practice.LLD.Practice.DesignATM.Card;

public class HasCardState extends ATMState{

    public HasCardState(){
        System.out.println("Please enter your PIN");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean pinCorrect = card.isPinCorrect(pin);
        if(pinCorrect){
            atm.setAtmState(new SelectOperationState());
        }else{
            System.out.println("Invalid PIN entered");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exit");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
