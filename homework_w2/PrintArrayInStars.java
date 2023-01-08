package homework_w2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NUM_ITEMS = scan.nextInt();
        int[] items = new int[NUM_ITEMS];

        for (int i = 0; i < items.length; i++) {
            items[i] = scan.nextInt();
        }

        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            int count = 0;
            for (int j = 1; j <= items[i]; ++j) {
                System.out.print("*");
                count++;
            }
            System.out.print("(" + count + ")");
            System.out.println();
        }
    }

}
