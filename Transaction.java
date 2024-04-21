import java.util.Date;

public class Transaction {
    private int transactionID;
    private Date date;
    private TransactionType type;
    private double amount;
    private String category;
    private String description;
    private String paymentMethod;
    private AccountType account;
    private boolean recurring;
    private Frequency recurrenceFrequency;

    // Constructor
    public Transaction(int transactionID, Date date, TransactionType type, double amount, String category,
                       String description, String paymentMethod, AccountType account, boolean recurring,
                       Frequency recurrenceFrequency) {
        this.transactionID = transactionID;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.account = account;
        this.recurring = recurring;
        this.recurrenceFrequency = recurrenceFrequency;
    }

    // Methods
    public void addTransaction() {
        // Implementation for adding a transaction
    }

    public void updateTransaction() {
        // Implementation for updating a transaction
    }

    public void deleteTransaction() {
        // Implementation for deleting a transaction
    }
}
