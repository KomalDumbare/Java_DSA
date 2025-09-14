public class Power_2 {
    public static void main(String[] args)
    {
        int num = 64;
        if(num <= 0)
        {
            System.out.println("Not a power of 2");
        }
        while(num % 2 == 0)
        {
            num = num / 2;
        }
        if(num == 1)
        {
            System.out.println("Number is power of 2");
        }
        else{
            System.out.println("Number is not a power of 2");
        }
    }
    
}
