package Questions.part_12Patterns;

public class butterfly {

    public static void butterflyPattern(int n) {
        // 1st half
        for(int i=1; i<=n; i++) {
            // Stars  i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // Spaces  2(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            // Stars i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Second half
        for(int i=n; i>=1; i--) {
            // Stars  i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // Spaces  2(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            // Stars i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPattern(4);
    }
}
