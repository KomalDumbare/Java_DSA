package StringFolder;

public class EndStartWith {
    public static void main(String[] args)
    {
        //endsWith() method
        String s = "komal@gmail.com";
        boolean s1 = s.endsWith("@gmail.com");
        if(s1)
        {
            System.out.println("True");
        } 
        else{
            System.out.println("False");
        }
        // startWith method
        boolean s2 = s.startsWith("Komal");
        if(s2)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
    
}
