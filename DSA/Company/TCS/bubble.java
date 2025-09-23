import java.util.Scanner;

class bubble {
    // Function to count swaps in bubble sort
    public static int countSwaps(int[] arr, boolean ascending) {
        int n = arr.length;
        int[] temp = arr.clone(); 
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascending) {
                    if (temp[j] > temp[j + 1]) {
                        int t = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = t;
                        swaps++;
                    }
                } else {
                    if (temp[j] < temp[j + 1]) {
                        int t = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = t;
                        swaps++;
                    }
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ascendingSwaps = countSwaps(arr, true);
        int descendingSwaps = countSwaps(arr, false);

        System.out.print(Math.min(ascendingSwaps, descendingSwaps));
    }
}