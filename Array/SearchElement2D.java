package Array;

public class SearchElement2D {
    public static boolean getElement(int arr[][],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    System.out.println("Element found at : [" +i+ "][" +j+ "]");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        int target = 10;
        boolean result = getElement(arr,target);
        if(!result)
        {
            System.out.println("The element not found"); 
        }
    }
    
}
