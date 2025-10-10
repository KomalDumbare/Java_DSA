package Array;
public class PeakIndex {

    public static int getIndex(int arr[],int n)
    {
        int start =0;
        int end = n-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2; // if this not work properly then just used int mid = end +(start - end)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid] > arr[mid - 1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{2,4,6,8,10,8,6,4,2};
        int n = arr.length;
        int result = getIndex(arr,n);
        System.out.println("The index of peak element is: "+result);
    }
    
}
