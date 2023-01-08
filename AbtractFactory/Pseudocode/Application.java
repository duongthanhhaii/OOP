package AbtractFactory.Pseudocode;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void pain() {
        button.pain();
        checkbox.pain();
    }




}
