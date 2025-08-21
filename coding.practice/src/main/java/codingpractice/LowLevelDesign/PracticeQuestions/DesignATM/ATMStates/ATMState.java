package codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.ATMStates;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.ATM;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.Card;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card){
        System.out.println("Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType){
        System.out.println("Something went wrong");
    }

    public void withdrawMoney(ATM atm, Card card, int amount){
        System.out.println("Something went wrong");
    }

    public void checkBalance(ATM atm, Card card){
        System.out.println("Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("Something went wrong");
    }

    public void returnCard(){
        System.out.println("Something went wrong");
    }

}
