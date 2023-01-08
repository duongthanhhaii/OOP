package homework_w4;

import java.util.Scanner;

public class RecursiveBinarySearch {
    static Scanner scan = new Scanner(System.in);

    public static int[] inputArray() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int binarySearch (int[] arr, int key, int fromIdx, int toIdx) {
        if (toIdx > fromIdx) {
            int midIdx = (fromIdx + toIdx) / 2;

            if (arr[midIdx] == key) {
                return midIdx;
            } else if (arr[midIdx] > key) {
                return binarySearch(arr, fromIdx, midIdx -1, key);
            }
            return binarySearch(arr,midIdx+1, toIdx, key);
        }
        return -1;
    }

    public static void main (String[] args) {
        int[] array = inputArray();
        int key = scan.nextInt();
        int keyIdx = binarySearch(array, 0, array.length-1, key );

        if ( keyIdx == -1) {
            System.out.print("no");
        } else {
            System.out.print (keyIdx);
        }
    }
}
