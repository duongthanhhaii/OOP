package Iterator.Menu;

import java.util.ArrayList;
import java.util.List;

public class PancakeMenu implements Menu{

    private List<String> items;

    public PancakeMenu() {
        items = new ArrayList<String>();

        addItem("K&B Pancake Breakfast");
        addItem("Blueberry Pancake");
        addItem("Waffle Pancake");
    }

    public void addItem(String name) {
        items.add(name);
    }

    public List<String> getMenuItems() {
        return items;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeIterator(items);
    }

    @Override
    public String toString() {
        return "Pancake Menu";
    }
}
