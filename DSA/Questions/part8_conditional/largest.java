package Questions.part8_conditional;
import java.util.*;

public class largest {
    public static void main(String[] args) {
        // int A=1, B=3, C=6;

        // if(A>=B && A>=C) {
        //     System.out.println("A is the largest");
        // } else if (B>=C) {
        //     System.out.println("B is the largest");
        // } else {
        //     System.out.println("C is the largest");
        // }

        // Ternary operator 
        int num = 75;
        String type = ( (num%2) == 0 ) ? "Even" : "Odd";
        System.out.println(type);
    }
}
