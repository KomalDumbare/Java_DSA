package Array;
public class ShipPackages {
    public static int getElement(int arr[],int n,int m)
    {
        int start = 0;
        int end = 0;
        int ans = -1;
        for(int i=0; i<n; i++)
        {
            start = Math.max(start,arr[i]);
            end = end + arr[i];
        }
        while(start <= end)
        {
            int mid = start + (end - start)/2;
             int load = 0;
             int ship = 1;
             for(int i=0;i<n;i++)
             {
                if(load + arr[i] > mid)
                {
                    ship++;
                    load = arr[i];
                }
                else 
                {
                    load += arr[i];
                }
            }
                if(ship <= m)
                {
                    ans = mid;
                    end = end - 1;
                }
                else 
                {
                    start = mid + 1;
                } 
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{3,2,2,4,1,4};
        int n = arr.length;
        int m = 3;
        int result = getElement(arr,n,m);
        System.out.println("The minimum capacity required to the ship for shift the packages is: "+result);
    }
    
}
