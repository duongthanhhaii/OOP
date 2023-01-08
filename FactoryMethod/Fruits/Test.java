package FactoryMethod.Fruits;

public class Test {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        Fruit fruit = factory.provideFruit("apple");
        fruit.produceJuice();

        fruit = factory.provideFruit("banana");
        fruit.produceJuice();

        fruit = factory.provideFruit("grape");
        fruit.produceJuice();

    }
}
