package Practice_Questions.part_18;

public class swap {
    public static void main(String[] args) {

        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        // Swap using XOR 

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swap: x = "+ x + " and y = " + y);
    }
}
