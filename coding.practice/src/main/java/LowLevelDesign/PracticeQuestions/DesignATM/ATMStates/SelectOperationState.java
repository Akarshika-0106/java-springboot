package LowLevelDesign.PracticeQuestions.DesignATM.ATMStates;

import LowLevelDesign.PracticeQuestions.DesignATM.ATM;
import LowLevelDesign.PracticeQuestions.DesignATM.Card;
import LowLevelDesign.PracticeQuestions.DesignATM.TransactionType;

public class SelectOperationState extends ATMState{

    public SelectOperationState(){
        showAllOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType){
            case CHECK_BALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawalState());
                break;
            default:
                System.out.println("Invalid option");
                exit(atm);
        }
    }

    private void showAllOperations(){
        System.out.println("Please select the transaction type");
        TransactionType.printAllTransactionTypes();
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
