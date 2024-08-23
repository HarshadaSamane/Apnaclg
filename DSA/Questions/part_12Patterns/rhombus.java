package Questions.part_12Patterns;

public class rhombus {
    
    public static void solidRhombus (int row) {
        for (int i=1; i<=row; i++) {
            // Spaces 
            for(int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j=1; j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus (int n) {
        for (int i=1; i<=n; i++) {
            // Spaces 
            for(int j=0; j<=(n-i); j++) {
                System.out.print("  ");
            }
            // Hollow Rectangle 
            // Stars 
            for(int j=1; j<=n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        solidRhombus(4);
        hollowRhombus(5);
    }
}
