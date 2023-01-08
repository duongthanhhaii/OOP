package Decorator.Cream;

public class Test {
    public static void main(String[] args) {
        IceCream cream1 = new ChocolateCream();
        IceCream honeyCream = new HoneyTopping(cream1);
        System.out.println(honeyCream.getDescription());

        IceCream cream2 = new VaniCream();
        IceCream nutsCream = new NutsTopping(cream2);
        System.out.println(nutsCream.getDescription());

    }
}
