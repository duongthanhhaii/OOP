package homework_w3;

public class FibonacciInt {
    public static int fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return f2;
    }

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("F(" + i + ")" + "=" + fibonacci(i));
            if ((Integer.MAX_VALUE - fibonacci(i)) < fibonacci(i - 1)) {
                System.out.println("F(" + (i + 1) + ")" + "is out of the range of int");
                break;
            }
        }
    }
}
