package exam;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }




    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void printAllCustomersAccountInfo(){
        for(Customer i : getCustomers()){
            System.out.println(i.getACCOUNT().printAccountInfo()+ "\n");

        }
    }
}
