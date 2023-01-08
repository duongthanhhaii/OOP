package Decorator.PizzaSelling;

public class Olivers extends ToppingDecorator{
    public Olivers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Oliver";
    }
}
