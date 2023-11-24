# Example

This example illustrate the use of Command pattern to manage bank account transations.

![height:250px](images/UMLCommandBankAccount.png)

* The BankAccount class that represents a bank account, and DepositCommand and WithdrawCommand classes that implement the Command interface. 
* The TransactionManager class acts as an invoker, responsible for executing the commands and maintaining a transaction history.
* The Main class, we create a bank account, deposit and withdraw money, and display the transaction history.
* Both DepositCommand and WithdrawCommand classes implement the unExecute method. The unExecute method is responsible for undoing the operation performed by the execute method.
* In DepositCommand, the execute method performs a deposit, and the unExecute method simulates a withdrawal of the same amount.
* In WithdrawCommand, the execute method performs a withdrawal, and the unExecute method simulates a deposit of the same amount.


# Exercíse

 1. Update Command to be an abstract class, and add to it a Date field to save da current date of the execution of the command.
 2. Update DepositCommand and WithdrawCommand to extends from Command class.
 3. Update the method execute in DepositCommand and WithdrawCommand, in order that the date is set.
 4. Add a toString method to Concrete Command classes
 5. Update the TransactionManager in order to show the date of each transaction,
 6. Run the main, and check the resuts.