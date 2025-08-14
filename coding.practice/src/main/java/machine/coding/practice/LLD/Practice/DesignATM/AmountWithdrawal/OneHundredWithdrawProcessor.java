package machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{

    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int requestedAmount) {
        int required = requestedAmount/100;
        int balance = requestedAmount%100;

        if(required <= atm.getNoOfHundredNotes()){
            atm.deductOneHundredNotes(required);
        }else if(required > atm.getNoOfHundredNotes()){
            atm.deductOneHundredNotes(atm.getNoOfHundredNotes());
            balance = balance + (required - atm.getNoOfHundredNotes())*100;
        }

        if(balance != 0){
            System.out.println("Something went wrong");
        }
    }
}
