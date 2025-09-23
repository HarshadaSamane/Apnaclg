import java.util.*;

public class monotonic {

    public static boolean isMonotonic(ArrayList<Integer> list) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) < list.get(i+1)){
                decreasing = false;
            }

            else if(list.get(i) > list.get(i+1)){
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();

        System.out.println("Enter "+ n + " integers");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(isMonotonic(list));

    }
}