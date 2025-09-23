package Array;

public class MissingNumber {
    public static int getElement(int arr[], int n)
    {
        int sum = 0;
        // Sum of array element
        for(int i=0; i<n-1; i++)
        {
            sum += arr[i];
        }

        // sum of n natural number
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            ans = n*(int)(n+1)/2;
        }
        int number =  ans - sum;
        return number;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,5,6};
        int n = arr.length;
        int result = getElement(arr,n);
        System.out.println("The missing number is: "+result);

    }
    
}
