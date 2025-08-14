package LowLevelDesign.PracticeQuestions.DesignATM;

public class Card {

    private int cvv;
    private int expiryDate;
    private int cardNumber;
    private static  final int PIN = 8531;
    private BankAccount bankAccount;

    public boolean isPinCorrect(int pin){
        if(pin == PIN){
            return true;
        }
        return false;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deductMoney(int amount){
        bankAccount.withdrawMoney(amount);
    }

    public int checkBalance(){
        return bankAccount.getBalance();
    }
}
