package Iterator.Menu;

public class DinerIterator implements Iterator {
    private String[] menuItems;
    private int position = 0;
    public DinerIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position>= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String item = menuItems[position];
        position+=1;
        return item;
    }
}
