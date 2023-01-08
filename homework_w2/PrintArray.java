package homework_w2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = scan.nextInt();
        int[] items = new int[NUM_ITEMS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = scan.nextInt();
            }
        }

        System.out.print("The values are: ");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("[" + items[i] + ",");
            } else if (i == items.length - 1) {
                System.out.print(" " + items[i] + "]");
            } else {
                System.out.print(" " + items[i] + ",");
            }
        }


    }


}
