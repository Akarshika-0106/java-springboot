package LowLevelDesign.PracticeQuestions.DesignATM.ATMStates;

import LowLevelDesign.PracticeQuestions.DesignATM.ATM;
import LowLevelDesign.PracticeQuestions.DesignATM.Card;

public class CheckBalanceState extends ATMState{
    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your balance is: "+card.getBankAccount().getBalance());
    }
}
