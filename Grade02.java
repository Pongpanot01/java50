import java.util.Scanner;

public class Grade02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        int grade = score;

        if (grade >= 80&&grade <=100)
        System.out.println("A");
        if (grade >= 75&&grade <=79)
        System.out.println("B+");
        if (grade >= 70&&grade <=74)
        System.out.println("B");
        if (grade >= 65&&grade <=69)
        System.out.println("C+");
        if (grade >= 60&&grade <=64)
        System.out.println("C");
        if (grade >= 55&&grade <=59)
        System.out.println("D+");
        if (grade >= 50&&grade <=54)
        System.out.println("D");
        if (grade >= 0&&grade <=49)
        System.out.println("F");
    }
}
