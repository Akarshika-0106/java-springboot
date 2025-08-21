package codingpractice.LowLevelDesign.PracticeQuestions.DesignATM;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.ATMStates.ATMState;
import codingpractice.LowLevelDesign.PracticeQuestions.DesignATM.ATMStates.IdleState;

public class ATM {

    private static final ATM atm = new ATM(); //Singleton Eager initialization
    private ATMState atmState;
    private int atmBalance;
    private int noOf2kNotes;
    private int noOfFiveHundredNotes;
    private int noOfHundredNotes;

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public static ATM getAtm(){
        atm.setAtmState(new IdleState());
        return atm;
    }

    public void setAtmBalance(int balance, int noOf2kNotes, int noOfFiveHundredNotes, int noOfHundredNotes){
        this.atmBalance = balance;
        this.noOf2kNotes = noOf2kNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfHundredNotes = noOfHundredNotes;
    }

    public void deductBalance(int amount){
        atmBalance = atmBalance - amount;
    }

    public void deduct2kNotes(int number){
        noOf2kNotes = noOf2kNotes - number;
    }

    public void deductFiveHundredNotes(int number){
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number){
        noOfHundredNotes = noOfHundredNotes - number;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public int getNoOf2kNotes() {
        return noOf2kNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfHundredNotes() {
        return noOfHundredNotes;
    }

    public void printAtmStatus(){
        System.out.println("ATM balance: "+atmBalance);
        System.out.println("Number of 2000 Notes: "+noOf2kNotes);
        System.out.println("Number of 500 Notes: "+noOfFiveHundredNotes);
        System.out.println("Number of 100 Notes: "+noOfHundredNotes);
    }
}
