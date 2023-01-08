package Builder.Products;

public class Engine {
    private double volume, mileage;
    private boolean started;

    public Engine (double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go (double mileage) {
        if (started){
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return this.volume;
    }

    public double getMileage() {
        return this.mileage;
    }

}
