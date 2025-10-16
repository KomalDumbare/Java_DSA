package TwoPointerTechnique;
import java.util.Arrays;
public class TwoMul {

    public static int[] getArray(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        while(start < end)
        {
            if(arr[start] * arr[end] == k)
            {
                return new int[]{arr[start],arr[end]};
            }
            else if(arr[start] * arr[end] < k)
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
        int arr[] = new int[]{2,3,6,7,8};
        int n = arr.length;
        int k = 12;
        int result[] = getArray(arr,n,k);
        if(result != null)
        {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        else{
            System.out.println("No Pair Found");
        }
    }
}
