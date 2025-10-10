package Array.TwoPointerTechnique;

public class TwoSum {
    public static int[] getArray(int arr[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    return new int[]{arr[i],arr[j]};
                }
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
        for(int a : result)
        {
            System.out.print(a+" ");
        } 
    }
    
}
