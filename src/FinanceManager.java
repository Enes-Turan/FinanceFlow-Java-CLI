import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FinanceManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double calculateBalance() {
        return transactions.stream()
                .mapToDouble(t -> t instanceof Income ? t.getAmount() : -t.getAmount())
                .sum();
    }

    public Map<String, Double> getCategoryBreakdown() {
        return transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getCategory,
                        Collectors.summingDouble(Transaction::getAmount)
                ));
    }
}