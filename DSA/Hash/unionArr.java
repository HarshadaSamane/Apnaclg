import java.util.*;
// package Hash;

public class unionArr {

    public static void union(int arr1[], int arr2[]) {
    
        HashSet<Integer> Unionset = new HashSet<>();

        for(int nums : arr1) {
            Unionset.add(nums);
        }

        for(int nums : arr2) {
            Unionset.add(nums);
        }

        for(int key : Unionset) {
            System.out.print(key + " ");
        }
        
    }
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 3};
        int arr2[] = {2, 3, 4, 5, 5};
        union(arr1, arr2);
    }
}
