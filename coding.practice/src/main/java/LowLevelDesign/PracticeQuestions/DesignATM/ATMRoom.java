package LowLevelDesign.PracticeQuestions.DesignATM;

public class ATMRoom {
    private ATM atm;
    private User user;


    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.atm.printAtmStatus();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 8531);
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getAtmState().withdrawMoney(atmRoom.atm, atmRoom.user.getCard(), 2700);
        atmRoom.atm.printAtmStatus();
    }

    private void initialize(){
        atm = ATM.getAtm();
        atm.setAtmBalance(3500, 1, 2, 5);

        this.user = createUser();
    }

    private User createUser(){
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){
        Card card =  new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(3000);
        return bankAccount;
    }
}
