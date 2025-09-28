package Collection_Framework;

import java.util.ArrayList;
public class RemoveElement {
    public static void main(String[] args)
    {
        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(50);
        list.add(2);
        list.add(12);
        list.add(7);
        list.add(25);
        list.add(89);

        System.out.println("List before deleting the element: "+list);

        list.remove(3);
        System.out.println("List after the remving the element: "+list);

    }
    
}
