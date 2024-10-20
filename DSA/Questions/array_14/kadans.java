package Questions.array_14;
// find maximum sum of subarray using kadan's algo 
public class kadans {

    public static void kadansSum(int array[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i=0; i<array.length; i++) {
            currentSum = currentSum + array[i];

            if(currentSum < 0 ) {
                currentSum = 0 ;
            }

            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum subarray sum is : " + maxSum);
    }
    public static void main(String args[]) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    }
}
