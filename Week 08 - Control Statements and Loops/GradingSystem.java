import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam score (0-100): ");
        int score = input.nextInt();

        char grade;
        if (score >= 70) {
            grade = 'A';
        } else if (score >= 60) {
            grade = 'B';
        } else if (score >= 50) {
            grade = 'C';
        } else if (score >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score: " + score + " -> Grade: " + grade);
    }
}
