import java.util.HashMap;
public class ImplementedAccounts
{
    HashMap<Integer, String> activeAccounts = new HashMap<Integer, String>();
    public ImplementedAccounts()
    {

    }
    public void addAccountToCollection(Account account)
    {
        String fullName = account.getFirstName() + " " + account.getMiddleInitial() + " " + account.getLastName();
        this.activeAccounts.put(account.getSSN(), fullName);
    }
    public void deleteAccount(Account account)
    {
        this.activeAccounts.remove(account.getSSN());
    }
}
