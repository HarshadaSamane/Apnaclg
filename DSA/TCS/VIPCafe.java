import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VIPCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of orders
        int N = sc.nextInt();
        
        // Read the priorities into a queue
        Queue<Order> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int priority = sc.nextInt();
            queue.add(new Order(priority, i + 1));  // Store priority and position
        }
        
        // Read the position of Raj's friend's order
        int K = sc.nextInt();
        
        int servedCount = 0; // Counter for served orders

        while (!queue.isEmpty()) {
            // Find the order with the maximum priority
            Order maxOrder = queue.peek();
            for (Order order : queue) {
                if (order.priority > maxOrder.priority) {
                    maxOrder = order;
                }
            }
            
            // Serve the maximum priority order
            if (maxOrder.position == K) {
                // If it's Raj's friend's order
                System.out.print(servedCount + 1);  // Output served count (1-based)
                return;
            } else {
                // Increment priority for all orders before the served one
                for (Order order : queue) {
                    if (order.position < maxOrder.position) {
                        order.priority++; // Increase the priority
                    }
                }
                // Serve the order
                queue.remove(maxOrder);
                servedCount++; // Increase served count
            }
        }
        
        // In case no order is served (should not happen with valid input)
        System.out.print(-1);
    }
}

// Helper class to store order details
class Order {
    int priority;
    int position;

    Order(int priority, int position) {
        this.priority = priority;
        this.position = position;
    }
}

