package homework_w5.hw5_Circle;

public class Cylinder extends hw5_Circle.Circle {
    private double height;

    public Cylinder() {
        super(2.1);
        this.height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return String.format("Cylinder[radius = %.2f", getRadius());
    }

}
