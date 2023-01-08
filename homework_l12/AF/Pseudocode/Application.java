package homework_l12.AF.Pseudocode;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    public  Application(GUIFactory f) {
        this.factory = f;
    }

    public void createUI() {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
