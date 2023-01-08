package Iterator.Menu;

public class DinerMenu implements Menu{
    final int MAX_ITEMS = 6;
    int position = 0;
    String[] menuItems;

    public DinerMenu() {
        menuItems = new String[MAX_ITEMS];

        addItem("Soup");
        addItem("Hot dog");
        addItem("Pasta");
        addItem("Pizza");

    }

    public void addItem(String name) {
        if (position >= MAX_ITEMS) {
            System.out.println("Menu is full");
        } else {
            menuItems[position] = name;
            position+=1;
        }
    }

    public String[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerIterator(menuItems);
    }

    @Override
    public String toString() {
        return "Diner Menu";
    }
}
