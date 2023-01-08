package homework_l12.AF.abtractFactory;

public class AbtractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory nonRoundedShapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = nonRoundedShapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = nonRoundedShapeFactory.getShape("Square");
        shape2.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundedShapeFactory.getShape("Rectangle");
        shape3.draw();
        Shape shape4 = roundedShapeFactory.getShape("Square");
        shape4.draw();
    }
}
