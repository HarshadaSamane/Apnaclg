import java.util.*;

// In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

public class que5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, cost = 0;

        System.out.println("Enter the no of Tickets");
        int ticket = sc.nextInt();

        if( ticket < 5 || ticket > 40) {
            System.out.println("Minimum of 5 & Maximum of 40");
            return;
        }

        System.out.println("Do you want refreshment");
        String ref = sc.next();

        System.out.println("Do you have coupon code");
        String cop = sc.next();

        System.out.println("Enter the circle ( k or q)");
        String circle = sc.next();
        if( circle.charAt(0) == 'k') {
            cost = 75 * (ticket);
        }
        else if( circle.charAt(0) == 'q') {
            cost = 150 * (ticket);
        }
        else{
            System.out.println("Invalid Input");
            return;
        }

        total = cost ;
        if( ticket > 20) {
            total -= (total * 0.1); 
        if( cop.charAt(0) == 'y') {
            total -= ((0.02) * total);
        }
        if( ref.charAt(0) == 'y') {
            total = total + (ticket * 50);
        }

        System.out.println("Total is :" + total);
    }

}
}
