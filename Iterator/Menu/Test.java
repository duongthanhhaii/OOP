package Iterator.Menu;

public class Test {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinnerIterator = dinerMenu.createIterator();

        prinMenu(pancakeIterator);
        System.out.println();
        prinMenu(dinnerIterator);

    }

    public static void prinMenu( Iterator iterator) {
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println(item);
        }
    }
}
