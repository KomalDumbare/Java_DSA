package StringFolder;

public class getBytes {
    public static void main(String[] args)
    {
        String s1 = "Hello";
        byte b[] = s1.getBytes();
        for(byte ele: b)
        {
            System.out.println(ele);
        }
    }
    
}
