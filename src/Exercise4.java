import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height : ");
        double height = in.nextDouble();
        System.out.print("Width  : ");
        double width = in.nextDouble();

        double perimeter = (height * 2.54) * 2 + (width * 2.54) * 2;
        System.out.printf("\n%,.2f centimeters.\n", perimeter);
        in.close();
    }
}
