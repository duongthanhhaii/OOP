package FactoryMethod.Fruits;

public class FruitFactory {
    public static Fruit provideFruit(String fruitType) {
        if (fruitType.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (fruitType.equalsIgnoreCase("banana")) {
            return new Banana();
        } else if (fruitType.equalsIgnoreCase("orange")) {
            return new Orange();
        } else {
            throw new IllegalArgumentException("Error!!");
        }
    }
}
