package Transaction.TransactionJavaFXclasses;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class TransactionController {

    @FXML
    private TextField transactionIDField;

    @FXML
    private DatePicker dateField;

    @FXML
    private TextField amountField;

    @FXML
    private TextField categoryField;

    @FXML
    private TextField descriptionField;

    @FXML
    private TextField paymentMethodField;

    @FXML
    private Button addTransactionButton;

    @FXML
    private Button updateTransactionButton;

    @FXML
    private Button deleteTransactionButton;

    @FXML
    private void addTransaction() {
        // Implement method to add transaction based on input fields
    }

    @FXML
    private void updateTransaction() {
        // Implement method to update transaction based on input fields
    }

    @FXML
    private void deleteTransaction() {
        // Implement method to delete transaction
    }
}
