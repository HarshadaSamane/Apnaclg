package Practice_Questions.Part_9;

import java.util.*;

public class evenodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int Choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evensum = evensum + number;
            } else {
                oddsum = oddsum + number;
            }
            System.out.println("Do you want to continue? Press 1 for yes and 0 for no");
            Choice = sc.nextInt();
        } while(Choice ==1);

        System.out.println("Sum of even numbers is: " + evensum);
        System.out.println("Sum of odd numbers is: "+ oddsum);
    }
}
