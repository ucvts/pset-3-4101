import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height : ");
        double height = in.nextDouble();
        System.out.print("Width  : ");
        double width = in.nextDouble();

        double area = (height * 25.4) * (width * 25.4);
        System.out.printf("\n%,.2f square millimeters.\n", area);
        in.close();
    }
}
