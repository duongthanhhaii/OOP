package Command.Pseudocode;

import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> history;

    public void push(Command c) {
        history.remove(c);
        history.add(c);
    }

    public Command pop() {
        return history.get(0);
    }
}
