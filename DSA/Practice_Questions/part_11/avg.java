import java.util.Scanner;

public class avg {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inut the first number: ");
        double x = sc.nextDouble();
        System.out.println("Inut the Second number: ");
        double y = sc.nextDouble();
        System.out.println("Inut the Third number: ");
        double z = sc.nextDouble();

        System.out.println("The average of three numbers is " + average(x, y, z));
    }

    public static double average(double x, double y, double z) {
        return ((x + y + z) / 3);
    }
}
