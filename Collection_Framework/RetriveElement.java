package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
public class RetriveElement {
    public static void main(String[] args)
    {
        ArrayList <String> al  = new ArrayList<String>();
        al.add("Pune");
        al.add("Mumbai");
        al.add("Nashik");
        al.add("Nagpur");
        al.add("Shivneri");

        System.out.println("The fourth city in the list is: "+al.get(4));

    }
    
}
