import java.text.DecimalFormat;
import java.util.*;





// Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and display it in the format (liters per 100 kilometers). 

// Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”. 

public class que1 {
    public static void main(String args[]) {

        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no to of litres too fill the tank");
        double lit = sc.nextDouble();

        if(lit < 1) {
            System.out.println(lit+ "is an invalid Input");
            System.exit(0);
        }

        System.out.println("Enter the distance covered");
        double dis = sc.nextDouble();

        if(dis < 1) {
            System.out.println(dis+ "is an invalid input");
        }

        double fuelConsumption = ((lit/dis)*100);
        System.out.println("Litres/100KM");
        System.out.println(df2.format(fuelConsumption));

        double miles = (dis*0.6214);
        double gallon = (lit*0.2642);
        double mg = (miles/gallon);

        System.out.println("miles/gallon");
        System.out.println(df2.format(mg));

    }
}
