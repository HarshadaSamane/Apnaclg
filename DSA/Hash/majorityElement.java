package Hash;

import java.util.HashMap;

// from the given array of size n find all elements that appears [n/3] times
public class majorityElement {

    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) { //true
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // create a key set to get all the keys 
        for(int key: map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String args[]) {
        int nums[]= {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(nums);
    }
}
