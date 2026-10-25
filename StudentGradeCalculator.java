import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        System.out.print("Enter the number of subjects: ");

        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Number of subjects must be positive.");
            sc.close();
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for subject " + i + " (0-100): ");

            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println(
                    "Invalid marks! Please enter marks between 0 and 100."
                );

                i--;
                continue;
            }

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / subjects;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n==================================");
        System.out.println("          FINAL RESULT");
        System.out.println("==================================");

        System.out.println("Total Subjects: " + subjects);
        System.out.println("Total Marks: " + totalMarks + "/" + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        if (grade.equals("F")) {
            System.out.println("Result: Needs Improvement");
        } else {
            System.out.println("Result: Passed");
        }

        System.out.println("==================================");

        sc.close();
    }
}

