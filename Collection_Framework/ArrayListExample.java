package Collection_Framework;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList<String>();
        al.add("Komal");
        al.add("Ram");
        al.add("Kunal");
        al.add("Tanamy");
        al.add("Neha");
        for(String c : al)
        {
             System.out.println(c+" ");
        }
    }
    
}
