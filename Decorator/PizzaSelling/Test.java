package Decorator.PizzaSelling;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olivers(cheesePizza);

        System.out.println(cheesePizza.getDescription() + ": " + cheesePizza.cost());
        System.out.println(greekPizza.getDescription() + ": " + greekPizza.cost());

    }
}
