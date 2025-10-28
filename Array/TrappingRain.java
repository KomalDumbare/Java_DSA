package Array;

public class TrappingRain {
    public static int getElement(int arr[],int n)
    {
        int leftMax[] = new int[n];
        leftMax[0] = 0;
        int rightMax[] = new int[n];
        int waterStored = 0;
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(leftMax[i-1],arr[i-1]);
        }
        rightMax[n-1] = 0; 
        for(int i=n-2; i>=0;i--)
        {
            rightMax[i] = Math.max(rightMax[i+1],arr[i+1]);
        }

        for(int i=0;i<n;i++)
        {
            int mini = Math.min(leftMax[i],rightMax[i]);
            if(mini - arr[i] >= 0)
            {
                waterStored += mini - arr[i];
            }
        } 
        return waterStored;
    }

    public static void main(String[] args)
    {
        int arr[] = {4,2,0,5,2,6,2,3};
        int n = arr.length;
        int result = getElement(arr,n);
        System.out.println("Minimum capacity to store the rain water: "+result);
    }
    
}
