package Array;

public class KadanesAlgo {
    public static int getElement(int arr[],int n)
    {
        int maxi = 0;
        for(int i=0; i<n; i++)
        {
            int prefix = 0;
            for(int j=0;j<n;j++)
            {
                prefix = prefix + arr[j];
                if(prefix < 0)
                {
                    prefix = 0;
                }

                maxi = Math.max(prefix,maxi);
            }
        }
        return maxi;
    }

    public static void main(String[] args)
    {
        int arr[] = new int[]{3,4,-5,8,-12,7,6,-2};
        int n = arr.length;
        int result = getElement(arr,n);
        System.out.println("the largest sum of the subarray: "+result);
    }
    
}
