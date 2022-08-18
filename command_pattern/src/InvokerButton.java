/*
 * @author Sherly Santiadi 2072025
 * Command Pattern
 * */

/*
*   Ini adalah kelas invoker
* */

public class InvokerButton {
    Command slot;

    public InvokerButton() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
