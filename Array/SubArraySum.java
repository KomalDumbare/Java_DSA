package Array;

public class SubArraySum {

    public static int getElement(int arr[],int n)
    {
        int TotalSum = 0;
        for(int i=0;i<n;i++)
        {
            TotalSum =TotalSum + arr[i];
        }

        int prefix = 0;
        for(int i=0; i< n-1; i++)
        {
            prefix += arr[i];
        

            int ans = TotalSum - prefix;
            if(prefix == ans)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{3,4,-2,5,8,20,-10,8};
        int n = arr.length;
        int result = getElement(arr,n);
        if(result == 1)
        {
            System.out.println("The sum of both subarray is equal: "+result);
        }
        else{
            System.out.println("The sum of both subarray is not equal: "+result);
        }
    }
    
}
