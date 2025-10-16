package TwoPointerTechnique;

import java.util.Arrays;

public class DifferencePairBin {

    public static int[] getArray(int arr[], int n, int k) {
        Arrays.sort(arr);  // Step 1: Sort the array

        // Step 2: For every element, search for arr[i] + k
        for (int i = 0; i < n; i++) {
            int target = arr[i] + k;

            // Simple binary search inside the array
            int start = i + 1;
            int end = n - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    // Found pair
                    return new int[]{arr[i], arr[mid]};
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Step 3: No pair found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {5, 50, 10, 40, 20};
        int n = arr.length;
        int k = 45;

        int result[] = getArray(arr, n, k);

        if (result[0] != -1) {
            System.out.println("Pair found:");
            System.out.println(result[0]);
            System.out.println(result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
