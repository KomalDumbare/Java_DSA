package Array;

public class PainterPartition {
    public static int getElement(int arr[],int n,int m)
    {
        int start =0;
        int end =0;
        int ans =-1;
        for(int i=0;i<n;i++)
        {
            start = Math.max(start,arr[i]);
            end = end+arr[i];
        }
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            int walls = 0;
            int count = 1;
            for(int i=0;i<n;i++)
            {
                if(walls + arr[i] > mid)
                {
                    count++;
                    walls = arr[i];
                }
                else 
                {
                    walls+=arr[i];
                }
            }
            if(count <= m)
            {
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,10,30,20,15};
        int n = arr.length;
        int m= 3;
        int result = getElement(arr,n,m);
        System.out.println("The number of wall allocated to the each painter is: "+result);
    }
    
}
