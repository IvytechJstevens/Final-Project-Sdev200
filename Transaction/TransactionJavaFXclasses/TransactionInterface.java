package Transaction.TransactionJavaFXclasses;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class TransactionInterface {
    public static TextField createTextField(String promptText) {
        TextField textField = new TextField();
        textField.setPromptText(promptText);
        return textField;
    }

    public static DatePicker createDatePicker() {
        return new DatePicker();
    }

    // Other methods to create GUI components specific to transactions
}
