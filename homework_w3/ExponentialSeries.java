package homework_w3;

import java.util.Scanner;

public class ExponentialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = x;
        for (int i = 1; i < numTerms; i++) {
            double ux = Math.pow(x, 2 * i + 1) / (double) (2 * i + 1);
            for (int j = 2 * i - 1; j > 0; j -= 2) {
                ux *= j / (double) (j + 1);
            }
            result += ux;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int numTerms = scan.nextInt();
        System.out.print(specialSeries(x, numTerms));
    }
}