import java.util.Scanner;

public class Grade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        int grade = score;
        boolean conditionA = grade >= 80&&grade <=100;
        boolean conditionBp = grade >= 75&&grade <=79;
        boolean conditionB = grade >= 70&&grade <=74;
        boolean conditionCp = grade >= 65&&grade <=69;
        boolean conditionC = grade >= 60&&grade <=64;
        boolean conditionDp = grade >= 55&&grade <=59;
        boolean conditionD = grade >= 50&&grade <=54;
        boolean conditionF = grade >= 0&&grade <=49;

        if (conditionA)
        System.out.println("A");
        if (conditionBp)
        System.out.println("B+");
        if (conditionB)
        System.out.println("B");
        if (conditionCp)
        System.out.println("C+");
        if (conditionC)
        System.out.println("C");
        if (conditionDp)
        System.out.println("D+");
        if (conditionD)
        System.out.println("D");
        if (conditionF)
        System.out.println("F");
    }
}
