package Questions.DividenCon_23;

public class mergesort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    //Recursive function to sort the array
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // find mid
        mergeSort(arr, si, mid); // sort left half
        mergeSort(arr, mid + 1, ei); // sort right half
        
        merge(arr, si, mid, ei); // merge the two halves
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1]; // make new temp arr to store the sorted elements
        int i = si; // iterator for left half
        int j = mid + 1; // iterator for right half
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        //left part is remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part is remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 8, 2 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
