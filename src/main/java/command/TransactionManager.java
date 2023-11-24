package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker class responsible for executing and managing commands.
 */
public class TransactionManager {
    private List<Command> transactionHistory = new ArrayList<>();

    /**
     * Execute a command and add it to the transaction history.
     *
     * @param command The command to be executed.
     */
    public void executeCommand(Command command) {
        command.execute();
        transactionHistory.add(command);
    }

    /**
     * Display the transaction history.
     */
    public String showTransactionHistory() {
        String str="Transaction History:\n";
        for (Command command : transactionHistory) {
            str+="- " + command.getClass().getSimpleName()+"\n";
        }
        return str;
    }

    public void undo() {
        Command cmd= this.transactionHistory.remove(transactionHistory.size()-1);
        cmd.unExecute();
    }
}