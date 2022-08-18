/*
 * @author Sherly Santiadi 2072025
 * Command Pattern
 * */
public class CommandPaste implements Command{
    Paste paste;

    public CommandPaste(Paste paste) {
        this.paste = paste;
    }

    @Override
    public void execute() {
        paste.paste();
    }
}
