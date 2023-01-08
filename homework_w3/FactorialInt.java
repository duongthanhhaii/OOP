package homework_w3;

public class FactorialInt {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            System.out.println("the factorial of " + i + " = " + factorial(i));
            if ((Integer.MAX_VALUE / factorial(i)) < i + 1) {
                System.out.println("the factorial of " + (i + 1) + " is out of range");
                break;
            }
        }
    }
}
