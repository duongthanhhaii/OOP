package homework_l12.AF.Pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String config = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (config.contains("win")) {
            factory = new WinFactory();
        } else if (config.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
