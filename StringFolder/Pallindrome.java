/*package StringFolder;

public class Pallindrome {
    public static void main(String[] args){

        String var = "Madam";
        String rev = " ";

        var = var.toLowerCase();
        for(int i = var.length()-1; i>=0; i--)
        {
            rev = rev+var.charAt(i);
        }
        if(rev.equals(var))
        {
            System.out.println("Pallidrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }

    }
}
*/

package StringFolder;

public class Pallindrome {
    public static void main(String[] args) {

        String var = "Madam";
        String rev = "";

        // Convert to lowercase to ignore case
        var = var.toLowerCase();

        // Reverse the string manually
        for (int i = var.length() - 1; i >= 0; i--) {
            rev = rev + var.charAt(i);
        }

        // Compare original and reversed
        if (rev.equals(var)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
