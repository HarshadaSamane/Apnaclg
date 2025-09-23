import java.util.ArrayList;
import java.util.Collections;

public class solution {

    public static int NumberOfCarries(int num1, int num2) {
        // Convert numbers to ArrayLists of digits
        ArrayList<Integer> digits1 = getDigits(num1);
        ArrayList<Integer> digits2 = getDigits(num2);

        // Ensure both lists are of equal length by padding with zeros
        int maxLength = Math.max(digits1.size(), digits2.size());
        while (digits1.size() < maxLength) {
            digits1.add(0, 0);
        }
        while (digits2.size() < maxLength) {
            digits2.add(0, 0);
        }

        int carry = 0; // To track the carry value during addition
        int carryCount = 0; // To count the total number of carries

        // Add digits from right to left
        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = digits1.get(i) + digits2.get(i) + carry;

            if (sum >= 10) {
                carry = 1; // Set carry for the next higher place
                carryCount++; // Increment carry count
            } else {
                carry = 0; // No carry for the next higher place
            }
        }

        return carryCount; // Return the total number of carries
    }

    private static ArrayList<Integer> getDigits(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        if (num == 0) {
            digits.add(0);
        } else {
            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
            Collections.reverse(digits); // Reverse to get the correct order of digits
        }
        return digits;
    }
}
