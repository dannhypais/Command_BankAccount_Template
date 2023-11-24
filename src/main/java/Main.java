import command.*;

// Client

/**
 * In this example, we have a BankAccount class that represents a bank account
 * DepositCommand and WithdrawCommand classes that implement the Command interface.
 * The TransactionManager class acts as an invoker, responsible for executing the commands and maintaining a transaction history.
 * The Main class, we create a bank account, deposit and withdraw money, and display the transaction history.
 */
    public class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("John Doe", 1000.0);

            Command depositCommand = new DepositCommand(account, 500.0);
            Command withdrawCommand = new WithdrawCommand(account, 200.0);

            TransactionManager transactionManager = new TransactionManager();

            // Execute commands
            transactionManager.executeCommand(depositCommand);
            transactionManager.executeCommand(withdrawCommand);

            // Show transaction history
            System.out.println(transactionManager.showTransactionHistory());

            // Check final balance
            System.out.println("Final balance: $" + account.getBalance());
            // Undo
            transactionManager.undo();
            // Show transaction history after undo
            System.out.println(transactionManager.showTransactionHistory());

            // Check final balance after undo
            System.out.println("Final balance: $" + account.getBalance());

        }

}
