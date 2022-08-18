/*
 * @author Sherly Santiadi 2072025
 * Command Pattern
 * */

public class Main {
    public static void main(String[] args) {
        InvokerButton invokerButton = new InvokerButton();
        // Create object
        Copy copy = new Copy();
        Paste paste = new Paste();

        CommandCopy commandCopy = new CommandCopy(copy);
        CommandPaste commandPaste = new CommandPaste(paste);

        invokerButton.setCommand(commandCopy);
        invokerButton.buttonWasPressed();
        invokerButton.setCommand(commandPaste);
        invokerButton.buttonWasPressed();
    }
}
