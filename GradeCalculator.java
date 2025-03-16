import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        int score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
    }

    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid score.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}