import java.util.Scanner;

public class Orchard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings for both players
        String ashokRow = sc.nextLine();
        String anandRow = sc.nextLine();

        // Validate inputs
        if (!isValid(ashokRow) || !isValid(anandRow)) {
            System.out.println("Invalid input");
            return;
        }

        // Calculate possibilities for Ashok and Anand
        int ashokPossibilities = countPossibilities(ashokRow);
        int anandPossibilities = countPossibilities(anandRow);

        // Determine and print the winner
        if (ashokPossibilities > anandPossibilities) {
            System.out.println("Ashok");
        } else if (anandPossibilities > ashokPossibilities) {
            System.out.println("Anand");
        } else {
            System.out.println("Draw");
        }
    }

    // Method to validate the input strings
    private static boolean isValid(String row) {
        return row.matches("[ML]*");  // Check if only M and L are present
    }

    // Method to count valid combinations of trees
    private static int countPossibilities(String row) {
        int count = 0;
        int length = row.length();

        // Iterate through the string to find valid combinations
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    // Check if they are not adjacent and of different types
                    if (row.charAt(i) != row.charAt(j) && row.charAt(j) != row.charAt(k) && row.charAt(i) != row.charAt(k)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
