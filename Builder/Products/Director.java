package Builder.Products;

public class Director {
    public void SportCar (Builder builder) {
        builder.reset().setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void SUV (Builder builder) {
        builder.reset()
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setGPS(new GPS());
    }
}
