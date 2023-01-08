package Command.Pseudocode;

public class Application {
    protected String clipboard;
    public Editor[] editors;
    public Editor activeEditor;
    private CommandHistory history;

    public Button copyButton;
    public Button cutButton;
    public Button pasteButton;
    public Button undoButton;
    public Shortcut shortcuts;

    public void createUI() {
        // giả sử mở 2 editor
        editors = new Editor[]{new Editor(), new Editor()};
        activeEditor = editors[0];

        copyButton = new Button();
        cutButton = new Button();
        pasteButton = new Button();
        undoButton = new Button();

        shortcuts = new Shortcut();

        history = new CommandHistory();

        Action copy = () -> executeCommand(new CopyCommand(this, activeEditor));
        copyButton.setCommand(copy);
        shortcuts.onKeyPress("Ctrl+C", copy);

        Action cut = () -> executeCommand(new CutCommand(this, activeEditor));
        cutButton.setCommand(cut);
        shortcuts.onKeyPress("Ctrl+X", cut);

        Action paste = () -> executeCommand(new PasteCommand(this, activeEditor));
        pasteButton.setCommand(paste);
        shortcuts.onKeyPress("Ctrl+V", paste);

        Action undo = () -> executeCommand(new UndoCommand(this, activeEditor));
        undoButton.setCommand(undo);
        shortcuts.onKeyPress("Ctrl+Z", undo);
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
