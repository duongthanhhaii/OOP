package hw5_Circle;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea () {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("Circle[radius=%.2f]", this.radius);
    }
}
