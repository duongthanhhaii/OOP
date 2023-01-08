package Animal;

public class Animal {
    private String name;

    public Animal (String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Animal[name = %s]", this.name);
    }
}
