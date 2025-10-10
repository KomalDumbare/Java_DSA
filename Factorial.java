import java.util.Scanner;
class Factorial{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find factorial: ");
        int factorial = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=factorial; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}