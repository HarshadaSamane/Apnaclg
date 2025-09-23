// Problem Statement: A password manager wants to create new passwords using two strings given by the user, then combined to create a harder-to- guess combination. Given two strings,interleave the characters of the strings to create a new string. Beginning with an empty string, alternately append a character from string a and from string b. If one of the strings is exhausted before the other, append the remaining letters from the other
// string all at once. The result is the new password.

import java.util.*;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String Password = "";
        int i, j;

        for (i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            Password = Password + s1.charAt(i) + s2.charAt(j);
        }
        if (i < s1.length()) {
            Password = Password + s1.substring(i, s1.length());
        }
        if (j < s2.length()) {
            Password = Password + s2.substring(i, s2.length());
        }
        System.out.println(Password);
    }
}
