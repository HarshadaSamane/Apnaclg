import java.util.*;

// Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

public class que6 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
            System.out.println("Season:Winter");    
                break;

            case 3:
            case 4:
            case 5:
            System.out.println();
        
            default:
                break;
        }
    }
}
