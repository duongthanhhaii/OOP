package Observer.Pseudocode;

public class EmailAlertsListener implements EventListeners{
    private String email, message;

    public EmailAlertsListener(String email,String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("email to " + email + ": \"" + newMessage + "\"");
    }
}
