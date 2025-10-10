package Array;

public class BookAllocation {
    public static int getElement(int arr[],int n,int m)
    {
        if(m>n)
        {
            return -1;
        }

        int start = 0;
        int end =0;
        int ans = -1;

        // start = max number of pages books 
        //end = sum of all pages of books
        for(int i=0;i<n;i++)
        {
            start = Math.max(start,arr[i]);
            end = end+arr[i];
        }

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            int page =0;
            int count =1;
            for(int i=0;i<n;i++)
            {
                if(page + arr[i] > mid){
                    count++;
                    page = arr[i];
                }
                else{
                    page += arr[i];
                }
            }
            if(count <= m){
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
        int arr[] = new int[]{12,34,67,90};
        int n = arr.length;
        int m = 2;
        int result = getElement(arr,n,m);
        System.out.println("The minimum pages allocated to the one student is: "+result);
    }
    
}
