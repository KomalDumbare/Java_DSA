package StringFolder;

public class EqualsIgnore {
    public static void main(String[] args)
    {
        String s1 = "Komal";
        String s2 = "KOMAL";
        boolean s3 = s1.equalsIgnoreCase(s2);
        //System.out.println(s3);
        if(s3)
        {
            System.out.println("Valid user");
        }
        else{
            System.out.println("Not valid user");
        }
    }
    
}
