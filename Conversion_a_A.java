import java.util.Scanner;
public class Conversion_a_A {
    public static char convert(char ch)
    {
        char ans = (char)(ch - 'a' + 'A');
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to convert from lowercase to uppercase: ");
        char ch = sc.next().charAt(0);
        char Change = Conversion_a_A.convert(ch);
        System.out.println(Change);
    }
    
}
