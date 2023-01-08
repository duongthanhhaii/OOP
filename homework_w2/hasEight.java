package homework_w2;

import java.util.Scanner;

public class hasEight {
    final int SENTINENT = -1;

    public static boolean hasEight(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 8) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (hasEight(number) == true) {
            System.out.print("ye");
        } else {
            System.out.print("no");
        }

    }
}
