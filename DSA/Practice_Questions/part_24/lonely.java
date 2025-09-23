import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class lonely {

    public static int lonelyNumber(ArrayList<Integer> list) {

        Collections.sort(list);
        ArrayList <Integer> newList = new ArrayList<>();

        for(int i=1; i<list.size()-1; i++) {
            if(newList.get(i-1) + 1 < newList.get(i) ) {

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();

        System.out.println("Enter "+ n + " numbers");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }


    }
}
