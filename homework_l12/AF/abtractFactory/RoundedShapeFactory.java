package homework_l12.AF.abtractFactory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }
}
