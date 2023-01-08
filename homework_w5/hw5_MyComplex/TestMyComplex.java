package hw5_MyComplex;

import java.util.Scanner;

public class TestMyComplex {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter complex number 1: ");
        double r1 = scan.nextDouble();
        double ig1 = scan.nextDouble();
        System.out.println("Enter complex number 2: ");
        double r2 = scan.nextDouble();
        double ig2 = scan.nextDouble();

        //number 1
        System.out.print("number 1 is: ");
        MyComplex number1 = new MyComplex(r1,ig1);
        System.out.println(number1);
        if (number1.isReal()) {
            System.out.println(number1 + " is a pure real number");
        } else {
            System.out.println(number1 + " is not a pure real number");
        }

        if (number1.isImaginary()) {
            System.out.println(number1 + " is a pure imaginary number");
        } else {
            System.out.println(number1 + " is not a pure imaginary number");
        }
        System.out.println(number1.magnitude());


        System.out.println();
        //number 2
        System.out.print("number 2 is: ");
        MyComplex number2 = new MyComplex(r2, ig2);
        System.out.println(number2);

        if (number2.isReal()) {
            System.out.println(number2 + " is a pure real number");
        } else {
            System.out.println(number2 + " is not a pure real number");
        }

        if (number2.isImaginary()) {
            System.out.println(number2 + " is a pure imaginary number");
        } else {
            System.out.println(number2 + " is not a pure imaginary number");
        }
        System.out.println(number2.magnitude());

        //equal
        if (number1.equals(number2)) {
            System.out.println("equals!");
        }else {
            System.out.println("not equals!");
        }

        //add
        System.out.println(number1.addNew(number2));

    }
}
