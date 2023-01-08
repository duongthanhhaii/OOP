package Observer.Pseudocode;

import java.io.File;

public class LoggingListener implements EventListeners{
    private File log;
    private String message;

    public LoggingListener(String filename, String message) {
        log = new File(filename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("write to " + log.getName() + ": \"" + newMessage + "\"");
    }
}
