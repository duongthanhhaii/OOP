package homework_w2;

import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        int[] studentGrades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            studentGrades[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numStudents; i++) {
            sum += studentGrades[i];
        }
        double averageGrades = sum / numStudents;
        System.out.printf("The average is: %.2f ", averageGrades);
        System.out.println();

        int minGrade = studentGrades[0];
        int maxGrade = studentGrades[0];

        for (int i = 0; i < numStudents; i++) {
            if (studentGrades[i] < minGrade) {
                minGrade = studentGrades[i];
            }

            if (studentGrades[i] > maxGrade) {
                maxGrade = studentGrades[i];
            }
        }
        System.out.println("The minimun is: " + minGrade);
        System.out.println("The maximun is: " + maxGrade);

    }

}
