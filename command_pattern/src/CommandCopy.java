/*
 * @author Sherly Santiadi 2072025
 * Command Pattern
 * */
public class CommandCopy implements Command{
    Copy copy;

    public CommandCopy(Copy copy) {
        this.copy = copy;
    }

    @Override
    public void execute() {
        copy.copy();
    }
}
