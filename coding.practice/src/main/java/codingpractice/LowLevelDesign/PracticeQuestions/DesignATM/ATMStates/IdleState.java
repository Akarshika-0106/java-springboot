package codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.ATMStates;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.ATM;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.Card;

public class IdleState extends ATMState{


    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
