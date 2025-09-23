package Array;

public class SearchElement {
    public static int getElement(int arr[], int n, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        int arr[] = {11, 56, 9, 8, 45, 3, 1};
        int n = arr.length;
        int target = 8;
        int result = getElement(arr, n, target);

        if (result != -1) {
            System.out.println("The target is found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
