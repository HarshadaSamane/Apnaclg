package Questions.part_11;

public class multiply {
    
    public static int multiple(int a, int b) {
        int product = a*b;
        return product;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiple(a, b);
        System.out.println("a * b = " + prod);

        prod = multiple(10, 20);
        System.out.println("a * b = " + prod);
    }
}
