package homework_l12.FM.Pseudocode;

public abstract class Dialog {
    abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
