import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Wage      : ");
        double wage = in.nextDouble();

        System.out.print("Monday    : ");
        double hours = in.nextDouble();
        System.out.print("Tuesday   : ");
        hours = hours + in.nextDouble();
        System.out.print("Wednesday : ");
        hours = hours + in.nextDouble();
        System.out.print("Thursday  : ");
        hours = hours + in.nextDouble();
        System.out.print("Friday    : ");
        hours = hours + in.nextDouble();
        System.out.print("Saturday  : ");
        hours = hours + in.nextDouble();
        System.out.print("Sunday    : ");
        hours = hours + in.nextDouble();

        double pay = wage * hours;

        System.out.printf("\n$%,.2f.\n", pay);
        in.close();
    }
}
