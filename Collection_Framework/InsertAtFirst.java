package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
public class InsertAtFirst {
    public static void main(String[] args)
    {
        ArrayList <Integer> al = new ArrayList<Integer>();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);

        al.add(0, 000);
        al.add(0,350); // Insert at First Position

        Iterator <Integer> itr = al.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
    
}
