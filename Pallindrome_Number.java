import java.util.Scanner;
public class Pallindrome_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check is it pallindrome or not: ");
        int num = sc.nextInt();
        int rem, ans = 0;
        int temp = num;
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem; 
        }
        if(temp == ans)
        {
            System.out.println("Pallindrome");
        }
        else{
            System.out.print("Not Pallindrome");
        }
    }

    
}
