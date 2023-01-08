package homework_w4;

import java.util.Scanner;

public class PrimeList {
    static Scanner scan = new Scanner(System.in);

    public static boolean isPrimes (int k) {
        for (int i = 2; i<=Math.sqrt(k); i++) {
            if (k%i !=0) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main (String[] args) {
        int boundNumber = scan.nextInt();
        for (int i=1; i<boundNumber; i++) {
            if (isPrimes(i)) {
                System.out.print (i + " ");
            }
        }
    }
}
