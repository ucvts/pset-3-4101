import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double fahrenheit = in.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        double kelvin = celsius + 273.15;

        System.out.printf("\nCelsius : %,.2f", celsius);
        System.out.printf("\nKelvin  : %,.2f\n", kelvin);
        in.close();
    }
}
