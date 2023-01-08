package homework_l12.AF.abtractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
