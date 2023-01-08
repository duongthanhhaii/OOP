package homework_w2;

import java.util.Scanner;

public class Reverse {
    static Scanner scan = new Scanner(System.in);

    public static int[] inputArray() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void reverse(int[] array) {
        int size = array.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[size - 1] = array[i];
            size--;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        reverse(arr);
    }
}
