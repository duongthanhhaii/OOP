package homework_l12.FM.FactoryPattern;

public class CallingClass {
    public static void main(String[] args) {
        try {
            FruitFactory factory = new FruitFactory();

            Fruit fruit1 = factory.provideFruit("Apple");
            fruit1.produceJuice();

            Fruit fruit2 = factory.provideFruit("Orange");
            fruit2.produceJuice();

            Fruit fruit3 = factory.provideFruit("Banana");
            fruit3.produceJuice();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
