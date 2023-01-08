package Decorator.Shapes;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape redCircle = new RedShapeDecorator(shape1);
        redCircle.draw();


    }
}
