package Decorator.PizzaSelling;

public abstract class Pizza {
    protected String description = "BASIC PIZZA";
    public abstract double cost();

    public String getDescription() {
        return description;
    }

}
