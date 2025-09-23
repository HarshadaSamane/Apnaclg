package CodeForces;
import java.util.*;

// Ternary numeric notation is quite popular in Berland. To telegraph the ternary number the Borze alphabet is used. Digit 0 is transmitted as «.», 1 as «-.» and 2 as «--». You are to decode the Borze code, i.e. to find out the ternary number given its representation in Borze alphabet.

// Input
// The first line contains a number in Borze code. The length of the string is between 1 and 200 characters. It's guaranteed that the given string is a valid Borze code of some ternary number (this number can have leading zeroes).

// Output
// Output the decoded ternary number. It can have leading zeroes.

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bronzeCode = sc.nextLine();

        StringBuilder decodeNumber = new StringBuilder();

        for(int i=0; i<bronzeCode.length(); i++) {
            if(bronzeCode.charAt(i) == '.') {
                decodeNumber.append('0');
            }
            else if(bronzeCode.charAt(i) == '-') {
                if(bronzeCode.charAt(i+1) == '.') {
                    decodeNumber.append('1');
                } 
                else if(bronzeCode.charAt(i+1) == '-') {
                    decodeNumber.append('2');
                }
                i++;
            }
        }
        System.out.println(decodeNumber.toString());

        sc.close();
    }
}
