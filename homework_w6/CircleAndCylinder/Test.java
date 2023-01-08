package CircleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("radius = " + cy1.getBase().getRadius()
                + ", height = " + cy1.getHeight()
                + ", color = " + cy1.getBase().getColor()
                + ", Base area = " + cy1.getBase().getArea()
                + ", Volume = " + cy1.getVolume()
                + ", surface area = " + cy1.getArea());

        Circle circle = new Circle(3);
        cy1.setBase(circle);
        System.out.println("radius = " + cy1.getBase().getRadius()
                + ", height = " + cy1.getHeight()
                + ", color = " + cy1.getBase().getColor()
                + ", base area = " + cy1.getBase().getArea()
                + ", volume = " + cy1.getVolume()
                + ", surface area = " + cy1.getArea());

        Cylinder cy3 = new Cylinder(2,5);
        System.out.println("radius = " + cy3.getBase().getRadius()
                + ", height = " + cy3.getHeight()
                + ", color = " + cy3.getBase().getColor()
                + ", base area = " + cy3.getBase().getArea()
                + ", volume = " + cy3.getVolume()
                + ", surface area = " + cy3.getArea());
    }
}
