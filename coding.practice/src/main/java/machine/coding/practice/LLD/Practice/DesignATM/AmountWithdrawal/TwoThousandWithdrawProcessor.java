package machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{

    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int requestedAmount) {
        int required = requestedAmount/2000;
        int balance = requestedAmount%2000;

        if(required <= atm.getNoOf2kNotes()){
            atm.deduct2kNotes(required);
        } else if(required > atm.getNoOf2kNotes()){
            atm.deduct2kNotes(atm.getNoOf2kNotes());
            balance = balance + (required - atm.getNoOf2kNotes())*2000;
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }
}
