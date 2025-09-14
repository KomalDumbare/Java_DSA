class Decimal_To_Binary{
    public static void main(String[] args)
    {
        int num = 13;
        int ans=0, rem, mul = 1;
        while(num > 0)
        {
            rem = num & 1;
            num = num >> 1;
            ans = rem * mul + ans;
            mul = mul * 10;
        }
        System.out.print(ans);
    }
}