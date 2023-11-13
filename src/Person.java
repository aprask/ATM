import java.util.ArrayList;
public abstract class Person
{
    private String firstName;
    private String lastName;
    private char middleInitial;
    private char gender;
    private ArrayList<PaymentTypes> paymentTypes = new ArrayList<>();
    public Person(String firstName, String lastName, char middleInitial, ArrayList<PaymentTypes> paymentTypes, char gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.paymentTypes = paymentTypes;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }
    public void addPaymentType(PaymentTypes typeOfPayment)
    {
        this.paymentTypes.add(typeOfPayment);
    }

    public ArrayList<PaymentTypes> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(ArrayList<PaymentTypes> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
