package Questions.DividenCon_23;

public class quicksort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //recursive function to sort the array
    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //sort left half
        quickSort(arr, pIdx+1, ei); //sort right half

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; //last element as pivot
        int i = si-1; //index of smaller element

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //to place pivot at correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 8, 2, -7 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
