package Array;

public class Rotateby1 {
    public static int[] rotate(int arr[],int n){
        int temp = arr[n-1];
        for(int i = n-2; i>-0;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        return arr;
    }
    public static void main(String[] args){
        int arr[] = new int[]{10,20,30,40,50};
        int n = arr.length;
        int result[] = rotate(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
    }
    
}
