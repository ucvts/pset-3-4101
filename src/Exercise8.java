import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Students : ");
        int passengers = in.nextInt();
        System.out.print("Teachers : ");
        passengers = passengers + in.nextInt();
        System.out.print("Capacity : ");
        int capacity = in.nextInt();

        int buses = passengers / capacity + 1;
        int overflow = passengers % capacity;

        System.out.println("\nBuses required      : " + buses);
        System.out.println("Overflow passengers : " + overflow);
        in.close();
    }
}
