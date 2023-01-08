package Bridge.Pseudocode;

public class Tv implements Device{
    private boolean on = true;
    private double volume = 30;
    private int chanel = 1;

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        if (this.volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;
    }
}
