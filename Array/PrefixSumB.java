package Array;

public class PrefixSumB {
    
    public static int[] getArray(int arr[],int n)
    {
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,8,9,-3,10,12,8};
        int n = arr.length;
        int result[] = getArray(arr,n);
        for(int r : result)
        {
            System.out.print(r+" ");
        }
    }
}
