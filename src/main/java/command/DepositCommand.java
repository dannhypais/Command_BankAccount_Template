package command;

import java.util.Date;

/**
 * ConcreteCommand representing a deposit operation.
 */
public class DepositCommand extends Command {
    private BankAccount account;
    private double amount;

    public DepositCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        setExecutionDate(new Date());
    }

    @Override
    public void unExecute() {
        account.withdraw(amount);
    }

    @Override
    public String toString() {
        return "DepositCommand: Deposit of " + amount + " on " + getExecutionDate();
    }
}
