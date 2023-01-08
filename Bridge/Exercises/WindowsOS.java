package Bridge.Exercises;

public class WindowsOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("WindowOS start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url);
    }
}
