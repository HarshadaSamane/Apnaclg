// Problem Statement: You are given an array, You have to choose a contiguous subarray of length ‘k’, and find the minimum of that segment, return the maximum of those minimums.

import java.util.*;

public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n-x; i++) {
            int min = Integer.MAX_VALUE;

            for(int j=i; j<(i+x); j++) {
                min = Math.min(min, arr[j]);
            }
            max = Math.max(min, max);
        }
        System.out.println(max);
    }
}
