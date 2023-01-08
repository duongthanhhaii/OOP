package homework_w4;

import java.util.Scanner;

public class SelectionSort {
    static Scanner scan = new Scanner(System.in);

    public static int[] inputArray() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] Sort (int[] arr) {
        for (int i =0; i<arr.length -1; i++) {
            int min = i;
            int min_value = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < min_value) {
                    min_value = arr[j];
                    min = j;
                }

            }
            int x = arr[min];
            arr[min] = arr[i];
            arr[i] = x;
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] arr = inputArray();
        printArray(Sort(arr));
    }
}
