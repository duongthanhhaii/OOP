package AbtractFactory.Shapes;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.toLowerCase().contains("rectangle")) {
            return new RoundedRectangle();
        } else {
            return new RoundedSquare();
        }
    }
}
