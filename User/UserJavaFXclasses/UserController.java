package User.UserJavaFXclasses;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class UserController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private DatePicker dateOfBirthPicker;

    @FXML
    private TextField securityQuestionField;

    @FXML
    private TextField securityAnswerField;

    @FXML
    private DatePicker accountCreationDatePicker;

    @FXML
    private Button createUserButton;

    @FXML
    private Button updateUserButton;

    @FXML
    private Button deleteUserButton;

    @FXML
    private void createUser() {
        // Implement method to create user based on input fields
    }

    @FXML
    private void updateUser() {
        // Implement method to update user based on input fields
    }

    @FXML
    private void deleteUser() {
        // Implement method to delete user
    }
}
