package command;
import java.util.Date;
import java.time.Instant;
/**
 * Command interface that declares the methods for executing and undoing a command.
 */

/**
 * author:patriciamacedo
 */
public abstract class Command {
    private Date executionDate;

    public Command() {
        this.executionDate = null;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    // Métodos abstratos
    public abstract void execute();
    public abstract void unExecute();
    public abstract String toString();

}