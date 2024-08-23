package Practice_Questions.part_11;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrom (int n ) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n == rev) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrom(14541));
    }
}
