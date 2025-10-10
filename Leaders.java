public class Leaders {
    public void getResult(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) { 
                    leader = false;
                    break; // break only if we find a bigger element
                }
            }
            if (leader == true) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 0, 4, 6};
        int n = arr.length;
        Leaders l = new Leaders();
        l.getResult(arr, n);
    }
}
