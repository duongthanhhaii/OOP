package Builder.Products;

public class TripComputer {
    private Car car;

    public void setCar (Car car) {
        this.car = car;
    }

    public void showStatus() {
        if (car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isnot started");
        }
    }
}
