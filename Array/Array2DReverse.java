package Array;

public class Array2DReverse {

    public static int[][] getArrayReverse(int [][]arr)
    {
        int row = arr.length;
        if (row == 0) return arr;
        int col = arr[0].length;
        for(int i=0;i<row;i++)
        {
            int start = 0;
            int end = col - 1;
            while(start < end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        return arr;

    }
    public static void main(String[] args)
    {
        int [][] arr = {
            {5,6,1},
            {9,2,8},
            {4,3,7}
        };

        int result[][] = getArrayReverse(arr);
        for(int i= 0; i< arr.length; i++)
        {
            for(int j=0; j< arr[0].length; j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
