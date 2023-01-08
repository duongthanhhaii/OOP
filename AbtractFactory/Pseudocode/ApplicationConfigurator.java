package AbtractFactory.Pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        String config = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (config.contains("win")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.createUI();
        app.pain();
    }
}
