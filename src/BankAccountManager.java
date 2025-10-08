import java.util.Scanner;
public class BankAccountManager {
    static final int people= 10;
        static Scanner scanner= new Scanner(System.in);
        static BankAccount[] bankAccounts= new BankAccount[people];
    public static void main(String[] args) {
        String input = "";
        do {
            displayMenu();
            input= scanner.nextLine();


        } while (!input.toUpperCase().equals("D"));

    }

    public static void displayMenu(){
        System.out.println("===Bank Account Menu===");
        System.out.println("A. Add Account");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Exit");
        System.out.print("Choose an option: ");
    }
}

class BankAccount{
    private String ownerName;
    private String accountNumber;
    private double balance;
    private static int totalAccounts = 0;

    BankAccount(String ownerName, String accountNumber, double initialBalance){
        this.ownerName= ownerName;
        this.accountNumber= accountNumber;
        if(initialBalance< 0){
            initialBalance= 0.0;
        } else{ this.balance= initialBalance; }
        totalAccounts++;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return (totalAccounts);
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance= amount + balance;
        }
    }

    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}

