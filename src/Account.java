import java.util.ArrayList;

public class Account extends User {
    private String password;
    private String userName;
    private String email;

    public Account(String firstName, String lastName, char middleInitial,
                   ArrayList<PaymentTypes> paymentTypes,
                   char gender, int userID, int SSN, double balance
                   , String password, String userName, String email) {
        super(firstName, lastName, middleInitial, paymentTypes, gender, userID, SSN, balance);
        this.password = password;
        this.userName = userName;
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
