import java.util.ArrayList;

public class Account{
    private String name;
    private double balance;

    private ArrayList < Account > accounts;
    private int numOfAccounts = 0;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance; 
        numOfAccounts++;  
    }

    public Account() {
    this.accounts = new ArrayList < Account > ();
    // System.out.println(balance);
    }


    
    public void addAccount( Account account) {
    accounts.add(account);
    System.out.println( accounts);
    }

    public double getBalance(Account account) {
        return balance;
    }

    public void deposit( Account account, double amount) {
        balance += amount;
        // System.out.println(balance);
    }

    public void withdraw(Account account, double amount) {
        balance -= amount;
        // System.out.println(balance);
    }

    public String getAccountInfo() {
        return "Name: " + name + "\nBalance: " + balance;
    }
}

// public class Account{
//     public static String name;
//     public static double balance;

//     public static int numOfAccounts = 0;
//     private ArrayList < String > accounts;

//     public Account(String name, double balance){
//         this.name = name;
//         this.balance = balance; 
//         numOfAccounts++;  
//     }

//     public static double getBalance() {
//         return balance;
//     }
//     // public Account() {
//     // accounts = new ArrayList < Account > ();
//     // }

//     public static String getName() {
//     return name;
//     }
    
//     public static int getAccounts() {
//     return numOfAccounts;
//     }