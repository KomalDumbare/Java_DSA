package Array.SortingTechniques;

public class BubbleSort {
    public static int[] getElement(int arr[],int n)
    {
        for(int i=n-2; i>=0; i--)
        {
            boolean swapped = false;
            for(int j=0; j<=i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }
            if(swapped == false)
                {
                    break;
                }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{7,8,5,1,9,4,3};
        int n = arr.length;
        int result[] = getElement(arr,n);
        System.out.println("The Sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(result[i]+" ");
        }
    }
}

Output: 

The Sorted array is: 
1 3 4 5 7 8 9 
