public class Binary_To_Decimal {
    public static void main(String[] args)
    {
        int num = 1101;
        int ans=0, rem, mul = 1;
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            ans = rem * mul + ans;
            mul = mul * 2;
         }
         System.out.print(ans);
    }
}
