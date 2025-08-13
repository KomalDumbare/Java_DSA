public class CheckSort {
    static boolean getResult(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1] > arr[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,20,30,40,50};
        if(getResult(arr))
        {
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    
}
