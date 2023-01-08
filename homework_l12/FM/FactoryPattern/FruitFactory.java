package homework_l12.FM.FactoryPattern;

public class FruitFactory {
    public Fruit provideFruit(String type) throws Exception {
        if (type == "Apple") {
            return new Apple();
        } else if (type == "Banana") {
            return new Banana();
        } else if (type == "Orange") {
            return new Orange();
        } else {
            throw new Exception("Error");
        }
    }
}
