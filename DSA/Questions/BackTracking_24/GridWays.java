import java.util.*;

public class GridWays{

    public static int countWays(int i, int j, int n, int m) {

        //base case
        if( i == n-1 && j == m-1) {  //last cell condition
            return 1;
        } else if ( i == n || j == m) {   //boundary cross condition
            return 0;
        }

        int w1 = countWays(i+1, j, n, m);  //move down
        int w2 = countWays(i, j+1, n, m);  //move right
        return w1+w2;


    }
    public static void main(String[] args) {
        int n = 3, m = 4;
        System.out.println(countWays(0, 0, n, m));
    }
}