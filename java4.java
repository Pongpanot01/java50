import java.util.Scanner;

public class java4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score: ");
            int score = scanner.nextInt();
            String grade = "F";

            if (score >= 50) {
                grade = "D";
                if (score >= 55) grade = "D+";
                if (score >= 60) grade = "C";
                if (score >= 65) grade = "C+";
                if (score >= 70) grade = "B";
                if (score >= 75) grade = "B+";
                if (score >= 80) grade = "A";
            }

            System.out.println("Your grade is: " + grade);
        }
    }
}