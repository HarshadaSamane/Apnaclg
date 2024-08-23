package Questions.part_11;

public class decTobin {
    
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + ((int) Math.pow(10, pow) * rem);

            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary form of " + myNum +" = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(8);
    }
}
