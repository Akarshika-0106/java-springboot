package codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository;

import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Transaction;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class TransactionRepository {
    private final Map<String, Transaction> transactions = new ConcurrentHashMap<>();

    public void save(Transaction transaction){
        transactions.put(transaction.getId(), transaction);
    }
    public Optional<Transaction> findById(String id){
        return Optional.ofNullable(transactions.get(id));
    }
}
