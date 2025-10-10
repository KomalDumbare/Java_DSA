package Array.SortingTechniques;    

import java.util.Scanner;
public class BinarySearch {
    public static int getElement(int arr[],int n,int key)
    {
        int start = 0;
        int end = n-1;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int key = sc.nextInt();
        int result = getElement(arr,n,key);
        if(result != -1)
        {
            System.out.println("The element is foud at the index: "+result);
        }
        else{
            System.out.println("Element is not found");
        }

    }
}
