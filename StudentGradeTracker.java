package codeAlpha;

import java.util.ArrayList;

public class StudentGradeTracker {
	private ArrayList<Student> students;

    public StudentGradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int mark) {
        students.add(new Student(name, mark));
    }

    public double getAverage() {
        int total = 0;
        for (Student s : students) {
            total += s.getMark();
        }
        return students.size() > 0 ? (double) total / students.size() : 0;
    }

    public int getHighest() {
        int highest = Integer.MIN_VALUE;
        for (Student s : students) {
            if (s.getMark() > highest) {
                highest = s.getMark();
            }
        }
        return highest;
    }

    public int getLowest() {
        int lowest = Integer.MAX_VALUE;
        for (Student s : students) {
            if (s.getMark() < lowest) {
                lowest = s.getMark();
            }
        }
        return lowest;
    }

    public void showReport() {
        System.out.println("\n----- Student Grade Report -----");
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + " | Mark: " + s.getMark());
        }
        System.out.printf("Average Score: %.2f\n", getAverage());
        System.out.println("Highest Score: " + getHighest());
        System.out.println("Lowest Score: " + getLowest());
    }
}



