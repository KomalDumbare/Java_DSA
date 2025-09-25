package Array.SortingTechniques;

public class SelectionSort {
    public static int[] getSortedArray(int arr[], int n)
    {
        for(int i=0; i<n-1;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }

                // Swap the numbers of array
                int temp = arr[i];
                 arr[i] = arr[index];
                 arr[index] = temp;

            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{6,10,5,7,1,9,3};
        int n = arr.length;
        int result[] = getSortedArray(arr,n);
        System.out.println("Sorted array is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    
}

output :

Sorted array is: 
1 3 6 5 7 9 10 