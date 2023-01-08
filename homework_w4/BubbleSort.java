package homework_w4;

import java.util.Scanner;

public class BubbleSort {
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
        int min = arr[0];
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] array = inputArray();
        printArray(Sort(array));
    }
}
