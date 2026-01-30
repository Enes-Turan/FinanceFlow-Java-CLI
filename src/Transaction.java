import java.io.Serializable;
import java.time.LocalDate;

public abstract class Transaction implements Serializable {
    private double amount;
    private String category;
    private LocalDate date;

    public Transaction(double amount, String category, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public abstract String getType();

    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return "[" + getType() + "] " + date + " | " + category + ": " + amount + " TL";
    }
}