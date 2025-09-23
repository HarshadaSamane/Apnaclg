// Most Frequent Number following Key(EASY)YouaregivenanintegerArraylistnums.Youarealsogivenanintegerkey,whichispresentinnums.Foreveryuniqueintegertargetinnums,countthenumberoftimestargetimmediatelyfollowsan occurrence of key in nums. In other words, count the number of indices i such that:0 <= i <= nums.size() - 2,nums.get(i) == key and,nums.get(i+1) == target.Return the target with the maximum count.(Assumption- that the target with maximum count isunique.

import java.util.*;

public class frqNumFollow {

    public static int frequentNumberFollowing(ArrayList<Integer> list, int key) {
        HashMap <Integer, Integer> freqMap = new HashMap<>();

        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) == key) {
                int target = list.get(i+1);
                freqMap.put(target, freqMap.getOrDefault(target, 0) + 1);
            }
        }

        int maxCount = 0;
        int result = -1;

        for(int target : freqMap.keySet()) {
            if(freqMap.get(target) > maxCount) {
                maxCount = freqMap.get(target);
                result = target;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();

        System.out.println("Enter the " + n + " numbers");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter the key element");
        int key = sc.nextInt();

        System.out.println("Target number is: ");
        System.out.println(frequentNumberFollowing(list, key));
    }
}
