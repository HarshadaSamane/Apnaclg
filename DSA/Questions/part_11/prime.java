package Questions.part_11;

public class prime {
  
    public static boolean isPrime( int n ) {

        // Corner cases 
        // 1 & 2

        if ( n == 2) {
            return true;
        }
        boolean isPrime = true;
        for( int i=2; i<=n-1; i++) {
            if( n%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {  //true
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println(isPrime(16));
        primeInRange(20);
    }
}

