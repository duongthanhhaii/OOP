package Decorator.Cream;

public class HoneyTopping implements ToppingDecorator{
    private IceCream iceCream;

    public HoneyTopping(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return addTopping() + iceCream.getDescription();
    }

    @Override
    public String addTopping() {
        return "Honey ";
    }
}
