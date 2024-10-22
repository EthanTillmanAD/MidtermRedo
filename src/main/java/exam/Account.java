package exam;

public abstract class Account {
    private final int ACCOUNT_NUMBER;
    private static int counter;
    private double balance;

    public Account() {
        counter++;
        this.ACCOUNT_NUMBER = counter;

    }


    public int getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public static int getCounter() {
        return counter;
    }


    public double getBalance() {
        return balance;
    }


    public abstract AccountType getAccountType();


    public void withdraw(double amount){
        double x = getTransactionFee(getAccountType());
        if(amount + x < balance){

            this.balance = balance - amount;

            balance -= x;
            String result = String.format("%,.2f", balance);
            System.out.println("Your new balance is now $" + result);
        }else{
            System.out.println("Insufficient Funds");
        }
    }

    public void deposit(double amount){


        if(amount > 0 ){
            double x = getInterestRate(getBalance(), amount);

            this.balance = balance + x;
            String result = String.format("%,.2f", balance);
            System.out.println("Your new balance is now $" + result);

        }else {
            System.out.println("Invalid amount");
        }
    }

    public double getInterestRate(double balance, double amount){
        this.balance = balance;
        if(amount > 1000 || this.balance > 1000 ) {
            double x = .10 * amount;
            return x + amount ;
        } else  {
            double x = .05 * amount;
            return x + amount ;
        }

    }

    public double getTransactionFee(AccountType accountType){

        if (accountType == AccountType.Savings){
            return 10.0;
        }else {

            return 5.0;
        }

    }
    public String printAccountInfo(){
        double x = getBalance();
        String decimals = String.format("%,.2f", x);
        return "Account Type: " + this.getAccountType() + "\nAccount Number: " + getACCOUNT_NUMBER() + "\nBalance: $" + decimals;
    }

    public static void printTotalNumberOfAccounts(){
        System.out.println("Total numbers of accounts -> " + getCounter());
    }
}
