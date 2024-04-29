package User;
import java.util.Date;

public class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String securityQuestion;
    private String securityAnswer;
    private Date accountCreationDate;

    // Constructor
    public User(String username, String password, String email, String firstName, String lastName,
                Date dateOfBirth, String securityQuestion, String securityAnswer, Date accountCreationDate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.accountCreationDate = accountCreationDate;
    }

    // Methods
    public void createUser() {
        // Implementation for creating a user
    }

    public void updateUser() {
        // Implementation for updating a user
    }

    public void deleteUser() {
        // Implementation for deleting a user
    }
}
