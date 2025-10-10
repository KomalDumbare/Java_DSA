public class Reverse {
    public static void getPrint(int[] arr,int n)
    {
        int start = 0;
        int end = n-1;
            while(start < end)
                {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            
            
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        int n = arr.length;
        getPrint(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
