package homework_w4;

import java.util.Scanner;

public class PerfectAndDeficient {
    public static boolean isPerfect (int n) {
        int sum = 0;
        for (int i=1; i<n; i++) {
            if (n%i==0) {
                sum +=i;
            }
        }
        if ( sum == n) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient (int n) {
        int sum = 0;
        for (int i=1; i<n; i++) {
            if (n%i==0) {
                sum +=i;
            }
        }
        if ( sum < n) {
            return true;
        }
        return false;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper bound number: ");
        int boundNumber = scan.nextInt();

        for (int i=1; i<=boundNumber; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
            //if (isDeficient(i)) {
            //    System.out.print (i + " ");
            //}
        }
    }
}
