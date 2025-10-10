package Array.SortingTechniques;

import java.util.Scanner;
public class InsertionSort   {
    public static int[] getElement(int arr[],int n){
        for(int i=1; i<n; i++)
        {
            for(int j=i; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Element: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int result[] = getElement(arr,n);
        for(int i=0; i<n; i++)
        {
            System.out.println(result[i]+" ");
        }
        
    }
    
}

Output : 

Enter the size of the Array: 
5
Enter the Array Element:
7 4 2 3 5
2 
3
4
5
7