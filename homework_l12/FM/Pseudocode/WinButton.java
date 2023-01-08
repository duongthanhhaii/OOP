package homework_l12.FM.Pseudocode;

public class WinButton implements Button{
    @Override
    public void render() {
        System.out.println("Render a button in Windows style");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a native OS click event");
    }
}
