public class Trailingzeros {
    public static int countTrailingzeroes(int N){
        int count = 0;
        while(N>=5)
        {
            N = N/5;
            count = count + N;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int N = 100;
        System.out.println("The number of trailing zeroes are: "+countTrailingzeroes(N));
    }
}
