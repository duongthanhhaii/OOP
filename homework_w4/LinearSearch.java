package homework_w4;

import java.util.Scanner;

public class LinearSearch {
    static Scanner scan = new Scanner(System.in);

    public static boolean linearSearch (int[] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex (int[] arr, int key) {
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static int[] inputArray() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] array = inputArray();
        int key = scan.nextInt();
        System.out.print (linearSearchIndex(array, key));
    }
}
