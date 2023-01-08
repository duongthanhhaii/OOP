package Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Dua");
        System.out.println(animal);
        Mammal mammal = new Mammal("Do");
        System.out.println(mammal);
        Cat cat = new Cat ("Sau");
        System.out.println(cat);
        cat.greets();
        Dog dog1 = new Dog ("Thoc");
        System.out.println(dog1);
        dog1.greets();
    }
}
