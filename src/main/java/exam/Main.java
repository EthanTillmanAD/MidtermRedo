package exam;

public class Main {

    public static void main(String[] args) {
        Bank wellsFargo = new Bank();

        Checking checkingAccount1 = new Checking();

        Customer customer1 = new Customer("Alex", "Jones", checkingAccount1);

        wellsFargo.addCustomer(customer1);

        customer1.getACCOUNT().deposit(2000);
        customer1.getACCOUNT().withdraw(100);
        customer1.getACCOUNT().withdraw(50);
        customer1.getACCOUNT().deposit(60);
        customer1.getACCOUNT().deposit(-500);

        Savings savings = new Savings();

        Customer customer2 = new Customer("Dan", "idk",  savings);

        wellsFargo.addCustomer(customer2);

        customer2.getACCOUNT().deposit(500);
        customer2.getACCOUNT().withdraw(1000000);
        customer2.getACCOUNT().withdraw(100);

        Checking checkingAccount2 = new Checking();

        Customer customer3 = new Customer("Jane", "Lesly", checkingAccount2);

        wellsFargo.addCustomer(customer3);

        customer3.getACCOUNT().deposit(1000);
        customer3.getACCOUNT().withdraw(100);



        wellsFargo.printAllCustomersAccountInfo();
        Account.printTotalNumberOfAccounts();

    }

}
