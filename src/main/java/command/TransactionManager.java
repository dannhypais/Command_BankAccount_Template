package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker class responsible for executing and managing commands.
 */
public class TransactionManager {
    private List<Command> transactionHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        transactionHistory.add(command);
    }

    public String showTransactionHistory() {
        StringBuilder str = new StringBuilder("Transaction History:\n");
        for (Command command : transactionHistory) {
            str.append("- ").append(command.toString()).append("\n");//ou str+= "- " + command.toString() + "\n";
        }
        return str.toString();
    }

    public void undo() {
        if (!transactionHistory.isEmpty()) {
            Command lastCommand = transactionHistory.remove(transactionHistory.size() - 1);
            lastCommand.unExecute();
        }
    }
}