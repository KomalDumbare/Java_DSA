package Array;

import java.util.Arrays;

public class AggressiveCow {
    public static int getElement(int arr[], int n, int m)
    {
        int start =1,end,mid,ans=-1;
        Arrays.sort(arr);

        end = arr[n-1] - arr[0];
        while(start <= end)
        {
            mid = start + (end - start)/2;
            int cowCount = 1;
            int pos = arr[0];
            for(int i=0; i<n;i++)
            {
                if(arr[i] - pos >= mid)
                {
                    cowCount++;
                    pos = arr[i];
                }
            }
            if(cowCount < m)
            {
                end = mid -1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,4,8,9};
        int n = arr.length;
        int m= 3;
        int result = getElement(arr,n,m);
        System.out.println("The maximum distance between the cows is: "+result);
    }
}
