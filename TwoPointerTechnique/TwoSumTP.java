package Array.TwoPointerTechnique;

public class TwoSumTP {

    public static int[] getArray(int arr[],int n,int target)
    {
        int start = 0;
        int end = n-1;
        while(start < end)
        {
            if(arr[start] + arr[end] == target)
            {
                return new int[]{arr[start],arr[end]};
            }
            else if(arr[start] + arr[end] < target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{2,7,11,15,27};
        int n = arr.length;
        int target = 22;
        int result[] = getArray(arr,n,target);
        for(int a:result)
        {
            System.out.print(a+" ");
        }
    }
}
