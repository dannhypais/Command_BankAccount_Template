package command;
/**
 * ConcreteCommand representing a withdrawal operation.
 */
public class WithdrawCommand implements Command {
    private BankAccount account;
    private double amount;

    /**
     * Constructor for WithdrawCommand.
     *
     * @param account The bank account on which the withdrawal operation is performed.
     * @param amount  The amount to be withdrawn.
     */
    public WithdrawCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void unExecute() {
        account.deposit(amount);
    }
}
