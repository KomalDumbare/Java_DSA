class Alternative{
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,20,30,40,50,60};
        int n = arr.length;
        for(int i=0;i<n-1;i=i+2)
        {
            System.out.println(arr[i]);
        }

    }
}
