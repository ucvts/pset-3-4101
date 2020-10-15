import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        int homework1 = in.nextInt();
        System.out.print("Homework 2 : ");
        int homework2 = in.nextInt();
        System.out.print("Homework 3 : ");
        int homework3 = in.nextInt();

        System.out.print("Quiz 1     : ");
        int quiz1 = in.nextInt();
        System.out.print("Quiz 2     : ");
        int quiz2 = in.nextInt();

        System.out.print("Test 1     : ");
        int test = in.nextInt();

        double homeworkAvg = (homework1 + homework2 + homework3) / 3.0;
        double quizAvg = (quiz1 + quiz2) / 2.0;
        double testAvg = (double) test;
        double grade = homeworkAvg * 0.15 + quizAvg * 0.35 + testAvg * 0.5;

        System.out.printf("\n%.2f%%.\n", grade);
        in.close();
    }
}
