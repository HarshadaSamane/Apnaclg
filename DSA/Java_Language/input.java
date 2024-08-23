import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // SUM OF A AND B 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

        // PRODUCT OF A AND B 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int product = A*B;
        System.out.println(product);

        // AREA OF CIRCLE 
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
