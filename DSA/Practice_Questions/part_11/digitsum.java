package Practice_Questions.part_11;

import java.util.Scanner;

public class digitsum {

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Sum of digits of the number is " + sumOfDigits(n));
    }
}
