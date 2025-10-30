package Array;

public class Sum2DArray {
    public static int[][] getElement(int arr1[][],int arr2[][])
    {
        int row = arr1.length;
        int col = arr1[0].length;
        int add[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return add;
    }
    public static void main(String[] args)
    {
        int arr1[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int arr2[][] ={
            {2,3,5},
            {6,1,9},
            {4,8,7}
        };
        
        int add[][] = getElement(arr1,arr2);
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
