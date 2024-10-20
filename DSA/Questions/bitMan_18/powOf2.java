package Questions.bitMan_18;

public class powOf2 {
    
    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    } 
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
