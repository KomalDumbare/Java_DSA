package Array;

public class DiagonalSum {
    public void getElement(int arr[][])
    {
        int row = arr.length;
        int col = arr[0].length;
        int FirstSum = 0;
        int secondSum = 0;
        for(int i=0;i<row;i++)
        {
            //First Diagonal Sum
            FirstSum += arr[i][i];

            //Second Diagonal Sum
            secondSum += arr[i][row-1-i];
        }
        System.out.println("The sum of First Diagonal is: "+FirstSum+"\n The sum of Second Diagonal is: "+secondSum);
    }
    public static void main(String[] args)
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        DiagonalSum ds = new DiagonalSum();
        ds.getElement(arr);
    }
}
