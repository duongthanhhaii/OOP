package Observer.Pseudocode;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LoggingListener logger = new LoggingListener("log.txt", "Someone has opened the file: %s");
        EmailAlertsListener email = new EmailAlertsListener("admin2@example.com", "The file has been opened: %s");
        editor.manager.subscribe("open", logger);
        editor.manager.subscribe("open", email);

        LoggingListener loggingListener = new LoggingListener("log_save.txt", "someone save your file");
        EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");
        editor.manager.subscribe("save", emailAlerts);
        editor.manager.subscribe("save", loggingListener);
//
        editor.openFile("test.txt");
        editor.manager.unsubscribe("open", logger);
        editor.openFile("haha.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
