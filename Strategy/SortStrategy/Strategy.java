package Strategy.SortStrategy;

public class Strategy {
    private static Strategy instance;
    private ISort sortee;

    private Strategy() {

    }

    public static  Strategy getInstance() {
        if (instance == null) {
            instance = new Strategy();
        }
        return instance;
    }

    public void setSortee (ISort sortee) {
        this.sortee = sortee;
    }

    public int sort (int[] data) {
        return sortee.sort(data);
    }

}
