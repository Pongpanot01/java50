import java.util.Scanner;

public class java22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur score : ");
        int score = scanner.nextInt();
        String grade = ""; {
            
            if(score <= 79){
                grade = "B+";
            }else if (score <=74 ){
                grade = "B";
            }else if (score <= 69){
                grade = "C+";
            }else if (score <= 64){
                grade = "C";
            }else if (score <= 59){
                grade = "D+";
            }else if (score <= 54){
                grade = "D";
            }else if (score <= 49){
                grade ="F";
            }else
                grade="A";
               
        }
        System.out.println("Your score is : "+grade);
}
}
