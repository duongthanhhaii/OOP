package homework_l12.AF.abtractFactory;

public abstract class FactoryProducer {
    public static AbstractFactory getFactory(boolean round){
        if (round) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
