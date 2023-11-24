package command;

import java.util.Date;

/**
 * ConcreteCommand representing a deposit operation.
 */
public class DepositCommand implements Command {
    private BankAccount account;
    private double amount;
    private Date date;

    /**
     * Constructor for DepositCommand.
     *
     * @param account The bank account on which the deposit operation is performed.
     * @param amount  The amount to be deposited.
     */
    public DepositCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
        date=null;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unExecute() {
        account.withdraw(amount);
    }
}
