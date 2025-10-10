package Array.TwoPointerTechnique;

public class Segregate01 {
    public static int[] getArray(int arr[],int n)
    {
        int start = 0;
        int end = n-1;
        while(start < end)
        {
            if(arr[start] == 0)
            {
                start++;
            }
            else{
                if(arr[end] == 0)
                {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,0,1,1,0,0,1,0,1,0};
        int n = arr.length;
        int result[] = getArray(arr,n);
        for(int a:result)
        {
            System.out.print(a+" ");
        }
    }
    
}
