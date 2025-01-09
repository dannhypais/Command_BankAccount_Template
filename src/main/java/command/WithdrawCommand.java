package command;
import java.util.Date;
/**
 * ConcreteCommand representing a withdrawal operation.
 */
public class WithdrawCommand extends Command {
    private BankAccount account;
    private double amount;

    public WithdrawCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
        setExecutionDate(new Date());
    }

    @Override
    public void unExecute() {
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "WithdrawCommand: Withdrawal of " + amount + " on " + getExecutionDate();
    }
}
