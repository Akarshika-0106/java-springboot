package machine.coding.practice.LLD.Practice.DesignATM.AmountWithdrawal;

import machine.coding.practice.LLD.Practice.DesignATM.ATM;

public abstract class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.nextCashWithdrawProcessor = cashWithdrawProcessor;
    }

    public void withdraw(ATM atm, int requestedAmount){
        if(nextCashWithdrawProcessor != null){
            nextCashWithdrawProcessor.withdraw(atm, requestedAmount);
        }
    }
}
