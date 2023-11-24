package command;
/**
 * Command interface that declares the methods for executing and undoing a command.
 */

/**
 * author:patriciamacedo
 */
public interface Command {
    /**
     * Execute the command.
     */

    void execute();

    /**
     * Undo the command.
     */

    void unExecute();
}