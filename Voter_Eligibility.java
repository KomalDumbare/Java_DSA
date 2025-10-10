import java.util.Scanner;
class Voter_Eligibility{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Voter: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("The person is eligible for voting.");
        }
        else{
            System.out.println("The person is not eligible for voting.");
        }
    }
}