package Strategy.SortStrategy;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5,20);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = random.nextInt(0, 100);
        }

        Strategy sortStrategy = Strategy.getInstance();
        String result = "";

        sortStrategy.setSortee(new BubbleSort());
        int[] arr = data.clone();
        result += "Using Bubble Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        int numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps + "\n\n";

        System.out.println(result);

    }
}
