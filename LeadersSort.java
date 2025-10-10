import java.util.*;
class LeadersSort{
  public void getResult(int arr[],int n)
  {
    ArrayList<Integer> leaderList = new ArrayList<>();
    int i,j;
    for(i=0;i<n;i++)
    {
      boolean lead = true;
      for(j=i+1;j<n;j++)
      {
        if(arr[j] > arr[i])
        {
          lead = false;
          break;
        }
      }
      if(lead == true)
      {
        leaderList.add(arr[i]);
      }
    }
    Collections.sort(leaderList);
    for(int l : leaderList)
    {
      System.out.println(l);
    }
  }
  public static void main(String[] args)
  {
    int arr[] = new int[]{10,22,12,0,4,6};
    int n = arr.length;
    LeadersSort L = new LeadersSort();
    L.getResult(arr,n);
  }
} 
    

