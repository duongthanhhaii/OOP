package Builder.Products;

public class Test {
    public static void makeCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.SportCar(carBuilder);
        Car car = carBuilder.getProduct();
        car.getEngine().on();
        car.getTripComputer().showStatus();
        car.getEngine().go(10);
        car.getEngine().off();
        System.out.println(car.getGPS().getRoute());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.SportCar(carManualBuilder);

        Manual manual = carManualBuilder.getProduct();
        System.out.println(manual.print());
    }

    public static void main(String[] args) {
         makeCar();
    }
}
