import java.util.*;

// Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

// Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.



public class que4 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of students placed in CSE:");
        int CSE = sc.nextInt();

        System.out.println("Enter the no of students placed in ECE:");
        int ECE = sc.nextInt();

        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();

        if( CSE < 0 || ECE < 0 || MECH < 0 ) {
            System.out.println("Invalid Input");
        }
        else {
            if( CSE == ECE && ECE == MECH && MECH == CSE) {
                System.out.println("None of the department has got the highest placement");
            }

            else if( CSE == ECE && CSE > MECH) {
                System.out.println("Highest Placement");
                System.out.println("CSE");
                System.out.println("ECE");
            }

            else if (CSE == MECH && CSE > ECE) {
                System.out.println("Highest Placement");
                System.out.println("CSE");
                System.out.println("MECH");
            }

            else if( MECH == ECE && MECH > CSE ) {
                System.out.println("Highest Placement");
                System.out.println("MECH");
                System.out.println("ECE");
            }

            else if( CSE > ECE && CSE > MECH) {
                System.out.println("Highest Placement");
                System.out.println("CSE");
            }

            else if( ECE > MECH || ECE > CSE) {
                System.out.println("Highest Placement");
                System.out.println("ECE");
            }

            else {
                System.out.println("Highest Placement");
                System.out.println("MECH");
            }
        }

    }

}
