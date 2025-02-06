package Questions.Recursion_20;

public class xpown {

    public static int power(int x, int n) {      //TC = O(n)
        if(n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn; 

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n) {     //TC = O(logn)
        if(n == 0) {
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        
        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 5));
    }
}
