import java.util.*;
public class RemoveDuplicates {
    public void getResult(int arr[],int n)
    {
        ArrayList<Integer> NewArrayList = new ArrayList<>();
        NewArrayList.add(arr[0]) ;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!= temp)
            {
                NewArrayList.add(arr[i]);
                temp = arr[i];

            }
            
        }
        System.out.println("Array after removing duplicates: "+NewArrayList);

    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,20,20,30,40,50};
        int n = arr.length;
        RemoveDuplicates R = new RemoveDuplicates();
        R.getResult(arr,n);
    }
    
}
