package Builder.Products;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }
    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        car.setSeats(number);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        car.setGPS(gps);
        return this;
    }

    public Car getProduct() {
        Car product = car;
        reset();
        return product;
    }
}
