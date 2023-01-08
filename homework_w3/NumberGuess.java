package homework_w3;

import java.util.Scanner;

public class NumberGuess {
    static final int SECRET_NUM = (int) (Math.random() * 100);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trial = 1;

        while (true) {
            int n = scan.nextInt();

            if (SECRET_NUM == n) {
                System.out.println("you got it in " + trial + " trial");
                break;
            } else if (SECRET_NUM > n) {
                System.out.println("try higher");
            } else {
                System.out.println("try lower");
            }
            trial++;
        }
    }
}
