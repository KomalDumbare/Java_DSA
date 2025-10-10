package Array;

public class ElementPosition {
    public static int searchElement(int arr[], int n,int Element)
    {
        int start = 0;
        int end = n-1;
        int position = n;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] == Element)
            {
                return mid;
            }
            else if(arr[mid] < Element)
            {
                start = mid + 1;
            }
            else
            {
                position = mid;
                end = mid - 1;
            }
        }
        return position;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,4,5,6,7};
        int n= arr.length;
        int Element = 3;
        int result = searchElement(arr,n,Element); 
        System.out.println("The Element place at the position: "+result);
    }
    
}
