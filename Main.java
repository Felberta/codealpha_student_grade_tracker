package codeAlpha;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGradeTracker tracker = new StudentGradeTracker();

        System.out.println("=== Student Grade Tracker ===");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter mark for " + name + ": ");
            int mark = sc.nextInt();
            sc.nextLine(); // consume newline

            tracker.addStudent(name, mark);
        }

        tracker.showReport();
        sc.close();
    }
}


