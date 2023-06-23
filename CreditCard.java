public class CreditCard {

    // Declare private instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // Constructor with all parameters
    public CreditCard(String cus, String bnk, String acc, int lim, double blnc)
    {
        customer = cus;
        bank = bnk;
        account = acc;
        limit = lim;
        balance = blnc;
    }

    // Constructor without balance parameter, sets balance to 0.0
    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    // Getter methods
    public String getCustomer()
    {
        return customer;
    }
    public String getBank()
    {
        return bank;
    }
    public String getAccount()
    {
        return account;
    }
    public int getLimit()
    {
        return limit;
    }
    public double getBalance ()
    {
        return balance;
    }

    public static void main(String[] args) {
        // Create a CreditCard object
        CreditCard card = new CreditCard("John Doe", "ABC Bank", "1234567890", 5000, 2500.0);

        // Print the customer details
        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Limit: " + card.getLimit());
        System.out.println("Balance: " + card.getBalance());
    }
}
