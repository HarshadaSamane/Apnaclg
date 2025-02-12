package Questions.DividenCon_23;

public class rsorted {

<<<<<<< Updated upstream
    public static int search(int arr[], int tar, int si, int ei) {
=======
    public static int search(int[] arr, int tar, int si, int ei) {
>>>>>>> Stashed changes
        if(si > ei) {
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == tar) {
            return mid;
        }

<<<<<<< Updated upstream
        //mid on L1
        if(arr[si] < arr[mid]) {
            //case a: left part
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            }
            else {
                //case b: right part
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else {
            //case c: right part
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            else {
                //case d: left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 0;
        int tarIdx = search(arr, tar, 0, arr.length-1);
        System.out.println(tarIdx);

=======
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3};
        
>>>>>>> Stashed changes
    }
}
