package Bridge.Pseudocode;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    double getVolume();
    void setVolume(double percent);
    int getChanel();
    void setChanel(int chanel);
}
