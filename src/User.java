import java.util.ArrayList;

public class User extends Person
{
    private int userID;
    private int SSN;
    private double balance;

    public User
                (
                String firstName, String lastName,
                char middleInitial,
                ArrayList<PaymentTypes> paymentTypes,
                char gender, int userID, int SSN, double balance
                )
    {
        super(firstName, lastName, middleInitial, paymentTypes, gender);
        this.userID = userID;
        this.SSN = SSN;
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
