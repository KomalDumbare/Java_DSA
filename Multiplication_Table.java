import java.util.Scanner;
class Multiplication_Table{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the table: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            int table = num * i;
            System.out.print(table+" ");
        }
        
        
    }
}