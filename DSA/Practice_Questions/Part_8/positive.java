package Practice_Questions.Part_8;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        // Que check um is positive or negative 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }
    }
}