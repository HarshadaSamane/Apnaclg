package Practice_Questions.part_16;
//Que. Print the number of 7’s that are inthe 2d array 
public class occurance {
    public static void main(String args[]) {
        int array[][] = { {4,7,8}, {8,8,7} };

        int countOf7 = 0;
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] == 7) {
                    countOf7++;
                }
            }
        }

        System.out.println("Count of 7 is " + countOf7);
    }
}
