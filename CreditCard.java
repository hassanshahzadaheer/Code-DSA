public class CreditCard {

    //
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // constructor
    public CreditCard(String cus, String bnk, String acc, int lim, double blnc)
    {
        customer = cus;
        bank = bnk;
        account = acc;
        limit = lim;
        balance = blnc;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cus,bnk,acc,lim,0.0);
    }

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


}
