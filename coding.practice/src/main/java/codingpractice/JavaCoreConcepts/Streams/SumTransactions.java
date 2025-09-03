package codingpractice.JavaCoreConcepts.Streams;

import codingpractice.JavaCoreConcepts.Streams.model.Transaction;

import java.util.List;

public class SumTransactions {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(250.5, "USD"),
                new Transaction(10.9, "USD")
        );

        double total = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("Total transaction amount: "+ total);

    }
}
