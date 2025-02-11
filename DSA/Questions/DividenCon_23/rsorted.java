package Questions.DividenCon_23;

public class rsorted {

    public static int search(int arr, int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == tar) {
            return mid;
        }
    }
    public static void main(String[] args) {
        int arr = {}
    }
}
