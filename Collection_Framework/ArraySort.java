package Collection_Framework;

import java.util.*;
public class ArraySort {
    public static void main(String[] args)
    {
        ArrayList <Integer> al = new ArrayList <Integer> ();

        al.add(10);
        al.add(50);
        al.add(30);
        al.add(20);
        al.add(60);

        System.out.println("Array before sorting: "+al);

        Collections.sort(al);

        System.out.println("Array after sorting: "+al);
    }
    
}
