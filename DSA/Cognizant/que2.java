import java.util.*;

// Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

// Rs.100/pizza
// Rs.20/puffs
// Rs.10/cooldrink
// Generate a bill for What Vohra has bought. 

public class que2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of pizzas bought");
        int pizza = sc.nextInt();

        System.out.println("Enter the no of puffs bought");
        int puffs = sc.nextInt();

        System.out.println("Enter the no of cooldrink bought");
        int cooldrink = sc.nextInt();

        int total = (pizza*100) + (puffs*20) + (cooldrink*10);

        System.out.println("Bill Details:");
        System.out.println("No of pizzas: " + pizza);
        System.out.println("No of puffs: " + puffs);
        System.out.println("No of cooldrink: " + cooldrink);
        System.out.println("Total Price: "+ total);
        System.out.println("ENJOOY THE SHOW!!!");
    }
}
