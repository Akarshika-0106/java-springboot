package codingpractice.JavaCoreConcepts.Streams.model;

public class Transaction {
    private double amount;
    private String currency;

    public Transaction(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmountInUSD() {
        // Assume all are in USD
        return amount;
    }

    public double getAmount() { return amount; }
}
