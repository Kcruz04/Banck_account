import java.util.ArrayList;

public class BankAccountTest {

    public static void main(String[] args) {

        Account account = new Account();

        Account checkingAccount = new Account( "checkingAccount", 100);

        Account savingAccount = new Account( "savingAccount", 1000);
        
        account.addAccount(checkingAccount);
        account.addAccount(savingAccount);
        account.deposit(savingAccount, 1000);
        account.deposit(checkingAccount, 100);
        System.out.println(account.getBalance(checkingAccount));
        System.out.println(account.getBalance(savingAccount));
        account.withdraw(checkingAccount, 50);
        System.out.println(account.getBalance(checkingAccount));
        // System.out.println(account.getAccounts());
        // System.out.println("Number Of Bank Accounts: " + Account.numOfAccounts);
        // for (Account a: account) {
        // System.out.println(account.getAccountInfo());
        // }

    }
}
        // Account checkingAccount = new Account( "checkingAccount", 100);
        // System.out.println(Account.getName());
        // System.out.println(Account.getBalance());
        // Account savingingAccount = new Account( "savingAccount", 1000);
        // System.out.println(Account.getName());
        // System.out.println(Account.getBalance());
        
        // String account = Account.getName();
        // double balance = Account.getBalance();