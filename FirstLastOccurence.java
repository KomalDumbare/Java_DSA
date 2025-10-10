package Array;
import java.util.ArrayList;
public class FirstLastOccurence {
    public static int[] FirstLast(int arr[],int n,int key)
    {
        int start =0;
        int end = n-1;
        int First = -1;
        int last = -1;
        while(start <= end)
        {
            int mid = start+(end - start)/2;
            if(arr[mid] == key)
            {
                First = mid;
                end = mid -1;
            }
            else if(arr[mid] < key)
            {
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }

        start =0;
        end = n-1;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] == key)
            {
                last = mid;
                start = mid + 1;
            }
            else if(arr[mid] < key)
            {
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return new int[]{First,last};
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,4,4,4,5,6};
        int n = arr.length;
        int key = 4;
        int result[] = FirstLast(arr,n,key);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
    
}
