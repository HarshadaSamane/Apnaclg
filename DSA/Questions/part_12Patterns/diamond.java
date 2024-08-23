package Questions.part_12Patterns;

public class diamond {

    public static void diamondShape(int n) {
        // first half 
        for (int i=1; i<=n; i++) {
            // Spaces 
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
                }
                System.out.println();
        }

        // Second half 
        for (int i=n; i>=1; i--) {
            // Spaces 
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondShape(4);
    }
}
