package AbtractFactory.Shapes;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
