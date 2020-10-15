import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = in.nextDouble();

        System.out.print("401(k)  : ");
        double retirementPct = in.nextDouble();
        System.out.print("Federal : ");
        double federalTaxPct = in.nextDouble();
        System.out.print("State   : ");
        double stateTaxPct = in.nextDouble();

        double pay = salary / 24.0;
        pay = pay - (pay * retirementPct / 100);
        double federal = pay * federalTaxPct / 100;
        double state = pay * stateTaxPct / 100;
        pay = pay - federal - state;

        System.out.printf("\n$%,.2f.\n", pay);
        in.close();
    }
}
