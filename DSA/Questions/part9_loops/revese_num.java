package Questions.part9_loops;

public class revese_num {
    public static void main(String args[]) {
        // Que reverse the num 
        int n = 140403;

        while ( n > 0 ) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();

        // Que save the reverse num 

        int num = 1234;
        int rev = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(rev);

    }
}
