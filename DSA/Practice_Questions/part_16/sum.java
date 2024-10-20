package Practice_Questions.part_16;
// Print out the sum of the numbers inthe second row of the “nums” array. 
public class sum {
    
    public static void main(String args[]) {
        
        int nums[][] =  { {1,4,9},{11,4,3},{2,2,3} };

        int sum = 0;

        // Sum of second row elements 
        for(int j=0; j<nums[0].length; j++) {
            sum += nums[1][j];
        }

        System.out.println("Sum is " + sum);
    }
}
