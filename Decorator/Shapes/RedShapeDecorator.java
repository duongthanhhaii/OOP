package Decorator.Shapes;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
        shape.draw();
    }

    public void setRedBorder() {
        System.out.print("Red ");
    }
}
