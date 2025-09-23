import java.util.*;

public class GoodString {  // Correct class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String goodLetters = sc.nextLine();  // Read the good string
        String name = sc.nextLine();          // Read the name
        
        int totalDistance = 0;

        if (goodLetters.isEmpty()) {  // Check if the good string is empty
            System.out.println("Good string cannot be empty.");
            return;  // Exit if empty
        }

        char prevGoodLetter = goodLetters.charAt(0);  // Start with the first good letter
        
        for (char nameChar : name.toCharArray()) {
            if (goodLetters.indexOf(nameChar) != -1) {
                prevGoodLetter = nameChar;  // Update if character is already in good string
                continue;  // No distance needed
            }
            
            int minDistance = Integer.MAX_VALUE;
            char nearestGoodLetter = goodLetters.charAt(0);
            
            for (char goodChar : goodLetters.toCharArray()) {
                int distance = Math.abs(nameChar - goodChar);  // Calculate distance
                
                // Find the minimum distance and update nearest good letter
                if (distance < minDistance) {
                    minDistance = distance;  // Update minimum distance
                    nearestGoodLetter = goodChar;  // Update nearest good letter
                } 
                else if (distance == minDistance) {
                    // Check if the new goodChar is closer to the previous good letter
                    if (Math.abs(prevGoodLetter - goodChar) < Math.abs(prevGoodLetter - nearestGoodLetter)) {
                        nearestGoodLetter = goodChar;  // Update nearestGoodLetter
                    }
                }
            }
            
            // Add the distance to total
            totalDistance += Math.abs(nameChar - nearestGoodLetter);
            prevGoodLetter = nearestGoodLetter;  // Update for next iteration
        }
        
        // Ensure clean output with no extra spaces
        System.out.println(totalDistance);  // Output total distance
    } // main method
} // GoodString class
