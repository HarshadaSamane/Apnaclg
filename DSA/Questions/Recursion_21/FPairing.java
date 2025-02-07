public class FPairing {

    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        //single
        int single = friendsPairing(n-1);

        //pair
        int pair = friendsPairing(n-2);
        int pairWays = (n-1)*pair;

        //Total ways 
        int totalWays = single + pairWays;
        return totalWays;
    } 
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
