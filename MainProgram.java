import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5];

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks)
            total += mark;
        return total;
    }

    double calculateAverageMarks() {
        return (double) calculateTotalMarks() / marks.length;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.display();
    }
}
