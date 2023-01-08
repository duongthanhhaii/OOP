package homework_w2;

import java.util.Scanner;

public class exponent {

    public static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scan.nextInt();

        System.out.print(base + " raises to the power of " + exp + " = " + exponent(base, exp));
    }
}
