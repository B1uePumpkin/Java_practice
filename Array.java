import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        //Array fundementals
        /*int[] grades = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array length: " + grades.length);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + i + ": " + grades[i]);
        }
        */
        //Student grades
        System.out.println("Enter the number of students: ");
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the grade for student " + i + ": ");
            grades[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numStudents; i++) {
            sum += grades[i];
        }
        System.out.println("Average grade: " + sum / numStudents);
    }
}