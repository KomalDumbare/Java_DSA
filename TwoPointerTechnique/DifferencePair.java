package Array.TwoPointerTechnique;

public class DifferencePair {
    public static int[] getArray(int arr[], int n, int k) {
        for(int i=0;i<n;i++) {
            for(int j = i+1;j<n; j++) {
                if(arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    return new int []{ arr[i],arr[j]};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 50, 10};
        int n = arr.length;
        int k = 45;
        int result[] = getArray(arr,n,k);
        if (result != null) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
