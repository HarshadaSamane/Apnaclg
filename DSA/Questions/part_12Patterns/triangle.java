package Questions.part_12Patterns;

public class triangle {
    public static void floydsTriangle (int row) {
        int counter = 1;
        for(int i=0; i<row; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        for(int i=1; i<n; i++) {
            for (int j=1; j<=i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydsTriangle(5);
        zeroOneTriangle(5);
    }
}
