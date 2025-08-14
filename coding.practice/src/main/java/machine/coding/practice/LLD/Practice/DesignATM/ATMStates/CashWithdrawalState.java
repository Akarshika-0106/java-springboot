package machine.coding.practice.LLD.Practice.DesignATM.ATMStates;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;
import machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal.CashWithdrawProcessor;
import machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal.OneHundredWithdrawProcessor;
import machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal.TwoThousandWithdrawProcessor;
import machine.coding.practice.LLD.Practice.DesignATM.Card;

public class CashWithdrawalState extends ATMState{

    @Override
    public void withdrawMoney(ATM atm, Card card, int amount) {
        if(amount > card.getBankAccount().getBalance()){
            System.out.println("Insufficient balance in card");
            exit(atm);
        }else if(amount > atm.getAtmBalance()){
            System.out.println("Insufficient balance in ATM");
            exit(atm);
        }
        card.deductMoney(amount);
        atm.deductBalance(amount);
        CashWithdrawProcessor cashWithdrawProcessor = new TwoThousandWithdrawProcessor(
                new FiveHundredWithdrawProcessor(
                        new OneHundredWithdrawProcessor(null)));

        cashWithdrawProcessor.withdraw(atm, amount);
        System.out.println("Cash is withdrawn");
        exit(atm);
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
