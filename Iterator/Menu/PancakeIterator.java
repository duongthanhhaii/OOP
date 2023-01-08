package Iterator.Menu;

import java.util.List;

public class PancakeIterator implements Iterator {
    private List<String> items;
    private int position = 0;
    public PancakeIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String item = items.get(position);
        position+=1;
        return item;
    }

}
