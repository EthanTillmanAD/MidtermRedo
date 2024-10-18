package exam;

public class Customer {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final Account ACCOUNT;


    public Customer(String firstName, String lastName, Account acount) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.ACCOUNT = acount;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public Account getACCOUNT() {
        return ACCOUNT;
    }
}
