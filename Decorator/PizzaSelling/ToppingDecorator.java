package Decorator.PizzaSelling;

public abstract class ToppingDecorator extends Pizza{
    protected Pizza pizza;

    public abstract String getDescription();
}
