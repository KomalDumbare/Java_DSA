public class ReverseArray {
    public void Reverse(int arr[],int n)
    {
        for(int i=n-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6};
        int n = arr.length;
        ReverseArray R = new ReverseArray();
        R.Reverse(arr,n);
    }
    
}
