import utils.*;
import java.util.Scanner;

/*
 * represent a bank for managing customers and their bank accounts
 */
public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();
    }
    /* 
     * Runs the program by initializing and managing, bank accounts and customers.
     */
    public void run() {
        System.out.println("Welcome to the Bank! What is your name?");
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.next();
        System.out.println("Hello "+ name + "! We are creating checking and sacings accounts for you.");
        Customer customer = new Customer(name); //use Customer constructor in the class to create a new customer 
        
        scanner.nextLine();
        System.out.println("What is your address?");
        String address = scanner.nextLine();
        customer.setAddress(address);// call the setAddress in the customer class in utils 
        
        BankAccount checkingAccount  = new BankAccount("checking", customer);//BankAccount is a .java class in Coursera.HW6_CIT590.banking package
        BankAccount savingsAccount  = new BankAccount("savings", customer);
        
        System.out.println();
        System.out.println("Customer info: ");
        System.out.println(checkingAccount.getCustomerInfo());

        System.out.println("Checking account info:");
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println("Saving account info:");
        System.out.println(savingsAccount.getAccountInfo());

        //Deposit
        //into checking 
        System.out.println();
        System.out.println("Amount (decimal) to deposit into your checking account?");
        double amount = scanner.nextDouble(); // get next token (double)
        checkingAccount.deposit(amount);
        
        //into saving 
        System.out.println();
        System.out.println("Amount (decimal) to deposit into your saving account?");
        amount = scanner.nextDouble();
        savingsAccount.deposit(amount);

        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        //withdraw
        
        //from checking 
        System.out.println();
        System.out.println("Amount (decimal) to withdraw from your checking account?");
        amount = scanner.nextDouble();

        //error handling 
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            // handle exception
            System.out.println(e.getMessage()); 
        }

        //from saving 
        System.out.println();
        System.out.println("Amount (decimal) to withdraw from your saving account?");
        amount = scanner.nextDouble();
        try {
            savingsAccount.withdraw(amount);
        } catch (Exception e) {
            // handle exception
            System.out.println(e.getMessage()); 
        }

        //print new balance;
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());
        scanner.close();
    }
}

