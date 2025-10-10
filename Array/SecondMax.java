package Array;

public class SecondMax {
    public static int getElement(int arr[],int n)
    {
        int ans = -1;
        for(int i=0; i<n; i++)
        {
            if(arr[i] > ans)
            {
                ans = arr[i];
            }
        }
        int second = -1;
        for(int i=0; i < n; i++)
        {
            if(arr[i] != ans)
            {
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{8,6,9,1,2};
        int n= arr.length;
        int result = getElement(arr,n);
        System.out.println("The second largest element is:  "+result);
    }
}
