import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount : ");
        double dollars = in.nextDouble();

        int pennies = (int) (dollars * 100);
        int quarters = pennies / 25;
        pennies = pennies % 25;
        int dimes = pennies / 10;
        pennies = pennies % 10;
        int nickels = pennies / 5;
        pennies = pennies % 5;

        System.out.println("\nQuarters : " + quarters);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nickels);
        System.out.println("Pennies  : " + pennies);
        in.close();
    }
}
