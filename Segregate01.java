package Array;

public class Segregate01 {
    public static int[] getArray(int arr[],int n)
    {
        int count0 = 0;
        int count1 = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                count0++;
            }
            else{
                count1++;
            }
        }
        for(int i=0; i<count0;i++)
        {
            arr[i] = 0;
        }
        for(int i=count0;i<n;i++)
        {
            arr[i] = 1;
        }
        return arr;

    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,0,1,0,0,1,1,0};
        int n = arr.length;
        int result[] = getArray(arr,n);
        for(int a : result)
        {
            System.out.println(a);
        } 
    }
}
