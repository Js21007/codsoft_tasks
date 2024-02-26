import java.util.Scanner;

public class student_grade_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME!");
        System.out.println("Let us calculate the Grades of Students.");
        System.out.println("Now, You have to enter marks for 5 Subjects.");
        System.out.println("Where each subject is 100 marks.");

        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for subject  " + (i + 1) + " : ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = calculateTotalMarks(marks);
        double averagePercentage = calculateAveragePercentage(totalMarks, marks.length);
        char grade = calculateGrade(averagePercentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks out of 500: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade:" + grade);

        scanner.close();
    }

    private static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
