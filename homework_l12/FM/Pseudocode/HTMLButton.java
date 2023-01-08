package homework_l12.FM.Pseudocode;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Return an HTML representation of a button");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a web browser click event");
    }
}
