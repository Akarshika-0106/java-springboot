package LowLevelDesign.PracticeQuestions.DesignATM;

public enum TransactionType {

    CHECK_BALANCE,
    CASH_WITHDRAWAL;

    public static void printAllTransactionTypes(){
        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }
}
