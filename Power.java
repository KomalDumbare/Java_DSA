import java.util.Scanner;
class Power{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find the power: ");
        int num = sc.nextInt();
        int n = 1;
        System.out.println("Enter the power which you want to find : ");
        int pow = sc.nextInt();
        for(int i=1; i<=pow; i++)
        {
            n *= num ;
            System.out.print(n+" ");
        }
    }
}