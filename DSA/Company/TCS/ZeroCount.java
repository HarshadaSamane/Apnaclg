import java.util.Scanner; 

public class ZeroCount {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        int first = sc.nextInt();  
        int second = sc.nextInt();  

        
        if (second == 0) {
            System.out.println(first);  
        } else {
            int ans = first - second;  

            // Ensure that ans is non-negative before proceeding
            if (ans < 0) {
                System.out.println("Negative result"); 
            } else {
                int count = ans / (second + 1);  
                if (ans % (second + 1) != 0) {
                    count++;  
                }
                System.out.print(count);  
            }
        }
        
        sc.close(); 
    }
}
