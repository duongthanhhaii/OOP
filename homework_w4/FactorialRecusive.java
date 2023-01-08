package homework_w4;

import java.util.Scanner;

public class FactorialRecusive {
    public static int factorial (int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(factorial(n));
    }
}
