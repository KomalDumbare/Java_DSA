package StringFolder;

public class CharAt {
    public static void main(String[] args)
    {
        String sn = "Hi, Everyone How are you?";
        char []ch = new char[sn.length()];
        for(int i=0; i< sn.length(); i++)
        {
             ch[i] = sn.charAt(i);
        }
        for(char c : ch)
        {
            System.out.print(c);
        }
    }
    
}
