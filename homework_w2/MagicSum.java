package homework_w2;

import java.util.Scanner;

public class MagicSum {
    static Scanner scan = new Scanner(System.in);

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

    public static int sumMagic() {
        int sum = 0;
        int number;
        do {
            System.out.println("Enter a positive number: ");
            number = scan.nextInt();
            if (hasEight(number)) {
                sum += number;
            }
        } while (number != -1);

        return sum;
    }

    public static void main(String[] args) {
        System.out.print(sumMagic());
    }
}
