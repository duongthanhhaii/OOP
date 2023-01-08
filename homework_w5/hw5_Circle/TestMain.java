package homework_w5.hw5_Circle;

import hw5_Circle.Circle;

public class TestMain {
    public static void main (String[] args) {
        hw5_Circle.Circle circle1 = new hw5_Circle.Circle(1.1);
        System.out.println (circle1);

        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius = " + circle1.getRadius());

        System.out.printf("area = %.2f%n", circle1.getArea());
        System.out.printf("p = %.2f", circle1.getCircumference());

        hw5_Circle.Circle shape = new Cylinder();
        System.out.println(shape);
        System.out.println(shape.getArea()); // getArea of cylinder ( khi override, sẽ ưu tiên chỏ tới lớp đối tượng (sau "new") )

        if (shape instanceof Cylinder) {
            System.out.println(((Cylinder)shape).getArea()); // getArea of Cylinder
        }

    }
}
