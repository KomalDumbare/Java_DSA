package TwoPointerTechnique;

public class DifferencePairPointer {

    public static int[] getArray(int arr[],int n,int k)
    {
        int start = 0;
        int end = 1;
        while(end < n)
        {
            if(arr[end] - arr[start] == k)
            {
                return new int[]{arr[start],arr[end]};
            }
            else if(arr[end] - arr[start] < k)
            {
                end++;
            }
            else
            {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,10,20,40,50};
        int n = arr.length;
        int k = 45;
        int result[] = getArray(arr,n,k);
        if(result != null)
        {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        else{
            System.out.println("No pair found");
        }
    }
    
}
