package homework_w2;

import java.util.Scanner;

public class Equals {
    static Scanner scan = new Scanner(System.in);

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int[] inputArray() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array1 = inputArray();
        int[] array2 = inputArray();
        if (equals(array1, array2)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
