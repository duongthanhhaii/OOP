package homework_w3;

import java.util.Scanner;

public class NumberSystemConversion {

    public static int toInt(String input, int inRadix) {
        int result = 0;
        for (int i = input.length(); i >= 0; i--) {
            int digit = Character.digit(input.charAt(i), inRadix);
            result += digit *= Math.pow(inRadix, (input.length() - 1 - i));
        }
        return result;
    }

    public static String toRadix(String input, int inRadix, int outRadix) {

        String alphabet = "0123456789ABCDEFGHIKLMNOPQRSTVUWXYZ";

        int tointResult = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int digit = Character.digit(input.charAt(i), inRadix);
            tointResult += digit *= Math.pow(inRadix, (input.length() - 1 - i));
        }

        String result = "";
        while (tointResult > 0) {
            result = alphabet.charAt(tointResult % outRadix) + result;
            tointResult /= outRadix;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String input = scan.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = scan.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = scan.nextInt();
        System.out.println(toRadix(input, inRadix, outRadix));
    }

}
