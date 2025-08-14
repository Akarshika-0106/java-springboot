package LowLevelDesign.PracticeQuestions.DesignATM.ATMStates;

import LowLevelDesign.PracticeQuestions.DesignATM.ATM;
import LowLevelDesign.PracticeQuestions.DesignATM.Card;

public class IdleState extends ATMState{


    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
