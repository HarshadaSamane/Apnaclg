// Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
// [Assume the number of inputs should be always 4 ] 

import java.util.Scanner;

public class que3 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int digit3 = sc.nextInt();
        int digit4 = sc.nextInt();

        char a = (char) digit1;
        char b = (char) digit2;
        char c = (char) digit3;
        char d = (char) digit4;

        System.out.println();
        System.out.print(digit1);
        System.out.println("-" + a);

        System.out.print(digit2);
        System.out.println("-" + b);

        System.out.print(digit3);
        System.out.println("-" + c);

        System.out.print(digit4);
        System.out.println("-" + d);

    }
    
}
