import java.util.*;
import java.math.*;

public class formatProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        BigInteger product = BigInteger.ONE;

        // Calculate product from A to B
        for (int i = A; i <= B; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        // Count trailing zeros (i.e., powers of 10)
        int countZeros = 0;
        while (product.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            product = product.divide(BigInteger.TEN);
            countZeros++;
        }

        System.out.println(product.toString() + " * 10^" + countZeros);
    }
}
