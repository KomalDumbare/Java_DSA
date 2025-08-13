import java.util.*;
class LeadersO {
        public void getResult(int arr[],int n)
        {
            ArrayList<Integer> LeaderList = new ArrayList<>();
            int max = Integer.MIN_VALUE;;
            for(int i=n-1;i>=0;i--)
            {
                if(arr[i] > max)
                {
                    LeaderList.add(arr[i]);
                    max = arr[i];
                }
            }
            System.out.println(LeaderList);
        }
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,22,12,0,4,6};
        int n = arr.length;
        LeadersO O = new LeadersO();
        O.getResult(arr,n);
    }
    
}
