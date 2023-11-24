package command;
/**
 * Receiver class representing a bank account.
 */
public class BankAccount {
    private String accountHolder;
    private double balance;

    /**
     * Constructor for BankAccount.
     *
     * @param accountHolder   The account holder's name.
     * @param initialBalance  The initial balance of the account.
     */
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    /**
     * Perform a deposit operation on the account.
     *
     * @param amount The amount to be deposited.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Perform a withdrawal operation from the account.
     *
     * @param amount The amount to be withdrawn.
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    /**
     * Get the current balance of the account.
     *
     * @return The current balance.
     */

    public double getBalance() {
        return balance;
    }
}