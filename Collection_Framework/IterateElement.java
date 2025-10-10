package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElement {
    public static void main(String[] args)
    {
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator <Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
    
}
