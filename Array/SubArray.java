package Array;

public class SubArray {
    public static int[] getArray(int arr[],int n)
    {
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i; k<=j;k++)
                {
                    a[i] = arr[k];
                }
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6};
        int n = arr.length;
        int result[] = getArray(arr,n);
        for(int i=0; i<n; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    
}
