package Budget;
import java.util.Date;

public class Budget {
    private int budgetID;
    private String budgetName;
    private String category;
    private double amount;
    private Date startDate;
    private Date endDate;
    private double remainingAmount;
    private double alertThreshold;
    private boolean notificationsEnabled;
    private Date creationDate;

    // Constructor
    public Budget(int budgetID, String budgetName, String category, double amount,
                  Date startDate, Date endDate, double remainingAmount, double alertThreshold,
                  boolean notificationsEnabled, Date creationDate) {
        this.budgetID = budgetID;
        this.budgetName = budgetName;
        this.category = category;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.remainingAmount = remainingAmount;
        this.alertThreshold = alertThreshold;
        this.notificationsEnabled = notificationsEnabled;
        this.creationDate = creationDate;
    }

    // Methods
    public void createBudget() {
        // Implementation for creating a budget
    }

    public void updateBudget() {
        // Implementation for updating a budget
    }

    public void deleteBudget() {
        // Implementation for deleting a budget
    }
}
