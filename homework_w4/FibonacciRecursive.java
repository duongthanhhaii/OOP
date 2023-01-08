package homework_w4;

import java.util.Scanner;

public class FibonacciRecursive {
    public static int fibonacci (int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(fibonacci(n));
    }
}
