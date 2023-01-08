package Decorator.Cream;

public class NutsTopping implements ToppingDecorator{
    private IceCream iceCream;

    public NutsTopping(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return addTopping() + iceCream.getDescription();
    }

    @Override
    public String addTopping() {
        return "Nuts ";
    }
}
