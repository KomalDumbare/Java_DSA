import java.util.Scanner;
public class Armstrong_No {
    public static int DigitCount(int num)
    {
        int count = 0;
        while(num > 0)
        {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static int ArmStrong(int num, int Count)
    {
        int rem , ans = 0, temp = num;
        while(temp > 0)
        {
            rem = temp % 10;
            ans = (int) (ans + Math.pow(rem,Count));
            temp = temp / 10;
        }
        return ans;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the it is Armstrong or not: ");
        int num = sc.nextInt();
        int Count = (int) DigitCount(num);
        int ifArmstrong = ArmStrong(num, Count);
        if(ifArmstrong == num)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
    
}
