package homework_l12.FM.Pseudocode;

public class Application {
    private static Dialog dialog;

    public static void init(String type) throws Exception {

        if (type.equalsIgnoreCase("windows")) {
            dialog = new WindowsDialog();
        } else if (type.equalsIgnoreCase("web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error");
        }
    }

    public static void main(String[] args) {
        try {
            init("Windows");
            dialog.render();
            init("Web");
            dialog.render();
            init("MacOS");
            dialog.render();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
