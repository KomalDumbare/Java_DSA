<<<<<<< Updated upstream
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
=======
package Array;

public class ReverseArray {
    public static int[] getElement(int arr[], int n)
    {
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,20,30,40,50};
        int n = arr.length;
        int result[] = getElement(arr,n);
        for(int i=0; i<n; i++)
        {
            System.out.println(result[i]);
        }
>>>>>>> Stashed changes
    }
    
}
