package utils;
//Represents a chacking/savings bank account for a customer
public class BankAccount {
    //instance vars
    /*
     * Type of account (Checking / Saving)
     */
    String accountType;
    /*Balance for bank account */
    double balance;
    /*customer for this account */
    Customer customer;

    //Constructor: Create a bank account of given type of given customer 
    public BankAccount(String accountType, Customer customer){
        this.accountType = accountType;
        this.customer = customer;
    }
    //methods Deposits the given account 
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) throws Exception { // need to add "thorw Exception"
        if(amount > this.balance) {
            throw new Exception("Amount is greater than available balance.");
        }
        this.balance -= amount;
    }
    /*
     * Returns account type and balance for this bank account 
     */
    public String getAccountInfo(){
        return this.accountType + ": " + this.balance;
    }

    public String getCustomerInfo(){
        return this.customer.getName() + ": " + this.customer.getAddress();
    }
}


