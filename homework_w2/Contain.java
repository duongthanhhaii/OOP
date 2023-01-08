package homework_w2;

import java.util.Scanner;

public class Contain {
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int key = scan.nextInt();
        if (contains(arr, key)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
